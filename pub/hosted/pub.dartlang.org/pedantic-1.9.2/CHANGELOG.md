## 1.9.2

Revert changes in `1.9.1` due to problems moving `unawaited` to `meta`.

## 1.9.1

`package:meta` is now the recommended place to get the `unawaited` method.

`pedantic` now exports that implementation, so the two are compatible.
`unawaited` will be removed from `pedantic` in version `2.0.0`.

## 1.9.0

- Enforce 17 new lint rules:

  - [`always_declare_return_types`]
  - [`always_require_non_null_named_parameters`]
  - [`annotate_overrides`]
  - [`avoid_null_checks_in_equality_operators`]
  - [`camel_case_extensions`]
  - [`omit_local_variable_types`]
  - [`prefer_adjacent_string_concatenation`]
  - [`prefer_collection_literals`]
  - [`prefer_conditional_assignment`]
  - [`prefer_final_fields`]
  - [`prefer_for_elements_to_map_fromIterable`]
  - [`prefer_generic_function_type_aliases`]
  - [`prefer_if_null_operators`]
  - [`prefer_single_quotes`]
  - [`prefer_spread_collections`]
  - [`unnecessary_this`]
  - [`use_function_type_syntax_for_parameters`]

- Mark a number of lints unused, see `README.md` for details.

[`always_declare_return_types`]: https://dart-lang.github.io/linter/lints/always_declare_return_types.html
[`always_require_non_null_named_parameters`]: https://dart-lang.github.io/linter/lints/always_require_non_null_named_parameters.html
[`annotate_overrides`]: https://dart-lang.github.io/linter/lints/annotate_overrides.html
[`avoid_null_checks_in_equality_operators`]: https://dart-lang.github.io/linter/lints/avoid_null_checks_in_equality_operators.html
[`camel_case_extensions`]: https://dart-lang.github.io/linter/lints/camel_case_extensions.html
[`omit_local_variable_types`]: https://dart-lang.github.io/linter/lints/omit_local_variable_types.html
[`prefer_adjacent_string_concatenation`]: https://dart-lang.github.io/linter/lints/prefer_adjacent_string_concatenation.html
[`prefer_collection_literals`]: https://dart-lang.github.io/linter/lints/prefer_collection_literals.html
[`prefer_conditional_assignment`]: https://dart-lang.github.io/linter/lints/prefer_conditional_assignment.html
[`prefer_final_fields`]: https://dart-lang.github.io/linter/lints/prefer_final_fields.html
[`prefer_for_elements_to_map_fromIterable`]: https://dart-lang.github.io/linter/lints/prefer_for_elements_to_map_fromIterable.html
[`prefer_generic_function_type_aliases`]: https://dart-lang.github.io/linter/lints/prefer_generic_function_type_aliases.html
[`prefer_if_null_operators`]: https://dart-lang.github.io/linter/lints/prefer_if_null_operators.html
[`prefer_single_quotes`]: https://dart-lang.github.io/linter/lints/prefer_single_quotes.html
[`prefer_spread_collections`]: https://dart-lang.github.io/linter/lints/prefer_spread_collections.html
[`unnecessary_this`]: https://dart-lang.github.io/linter/lints/unnecessary_this.html
[`use_function_type_syntax_for_parameters`]: https://dart-lang.github.io/linter/lints/use_function_type_syntax_for_parameters.html

## 1.8.0

- Enforce three new lint rules:

  - [`prefer_iterable_whereType`]
  - [`unnecessary_const`]
  - [`unnecessary_new`]

[`prefer_iterable_whereType`]: https://dart-lang.github.io/linter/lints/prefer_iterable_whereType.html
[`unnecessary_const`]: https://dart-lang.github.io/linter/lints/unnecessary_const.html
[`unnecessary_new`]: https://dart-lang.github.io/linter/lints/unnecessary_new.html

## 1.7.0

- Add versioned `analysis_options.yaml` files to the package so it's possible
  to pin to a version without also pinning the pub dependency. See `README.md`
  for updated usage guide.

## 1.6.0

- Enforce six new lint rules:

  - [`curly_braces_in_flow_control_structures`]
  - [`empty_catches`]
  - [`library_names`]
  - [`library_prefixes`]
  - [`type_init_formals`]
  - [`unnecessary_null_in_if_null_operators`]

[`curly_braces_in_flow_control_structures`]: https://dart-lang.github.io/linter/lints/curly_braces_in_flow_control_structures.html
[`empty_catches`]: https://dart-lang.github.io/linter/lints/empty_catches.html
[`library_names`]: https://dart-lang.github.io/linter/lints/library_names.html
[`library_prefixes`]: https://dart-lang.github.io/linter/lints/library_prefixes.html
[`type_init_formals`]: https://dart-lang.github.io/linter/lints/type_init_formals.html
[`unnecessary_null_in_if_null_operators`]: https://dart-lang.github.io/linter/lints/unnecessary_null_in_if_null_operators.html

## 1.5.0

- Enforce three new lint rules:

  - [`avoid_shadowing_type_parameters`],
  - [`empty_constructor_bodies`],
  - [`slash_for_doc_comments`] - Violations can be cleaned up with
    [the formatter]'s `--fix-doc-comments` flag.

[`avoid_shadowing_type_parameters`]: https://dart-lang.github.io/linter/lints/avoid_shadowing_type_parameters.html
[`empty_constructor_bodies`]: https://dart-lang.github.io/linter/lints/empty_constructor_bodies.html
[`slash_for_doc_comments`]: https://dart-lang.github.io/linter/lints/slash_for_doc_comments.html
[the formatter]: https://github.com/dart-lang/dart_style#style-fixes

## 1.4.0

- Enforce `avoid_init_to_null` and `null_closures`.

## 1.3.0

- Enforce `prefer_is_empty`.

## 1.2.0

- Enforce `unawaited_futures`. Stop enforcing `control_flow_in_finally` and
  `throw_in_finally`.

## 1.1.0

- Move `analysis_options.yaml` under `lib` so you can import it directly from
  your own `analysis_options.yaml`. See `README.md` for example.

## 1.0.0

- Describe Dart static analysis use at Google in `README.md`.
- Add sample `analysis_options.yaml`.
- Add `unawaited` method for silencing the `unawaited_futures` lint.
