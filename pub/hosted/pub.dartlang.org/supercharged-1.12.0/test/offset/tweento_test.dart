import 'package:flutter_test/flutter_test.dart';
import 'package:supercharged/supercharged.dart';

void main() {
  test('Offset tweenTo 1', () {
    final tween = Offset(0, -100).tweenTo(Offset(100, 0));
    expect(tween.runtimeType.toString(), 'Tween<Offset>');
    expect(tween.begin, Offset(0, -100));
    expect(tween.end, Offset(100, 0));

    var half = tween.transform(0.5);
    expect(half.dx, 50);
    expect(half.dy, -50);
  });

  test('Offset tweenTo 2', () {
    final tween = Offset(50, 50).tweenTo(Offset.zero);

    var half = tween.transform(0.5);
    expect(half.dx, 25);
    expect(half.dy, 25);
  });
}

