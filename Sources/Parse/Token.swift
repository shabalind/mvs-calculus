import Basic

/// A token
public struct Token {

  /// The kind of the token.
  public var kind: Kind

  /// The range of the token in the source input.
  public var range: SourceRange

  public init(kind: Kind, range: SourceRange) {
    self.kind = kind
    self.range = range
  }

  /// The value of the token.
  ///
  /// - Parameter source: The source input from which the token was extracted.
  public func value(in source: String) -> Substring {
    return source[range]
  }

  /// The kind of a token.
  public enum Kind {

    case error

    case name
    case `struct`
    case `let`
    case `var`
    case `if`
    case `else`
    case `in`
    case `inout`
    case int
    case float
    case comma
    case dot
    case colon
    case equal
    case amp
    case arrow
    case lParen
    case rParen
    case lBrace
    case rBrace
    case lBracket
    case rBracket

  }

}
