  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [s1]
    var p1: s0
  }
  func f62(_ v0: [s2]) -> [s2] {
    return v0
  }
  @inline(never)
  func f0(_ v0: [[s2]], _ v1: Double) -> Double {
    var v5: Double = v1
    let v2: [Double] = [v1, v5, v1, v5]
    let v10: Double = v2[0]
    var v8: Double = v10
    let v17: [s2] = v0[0]
    let v28: [s2] = f62(v17)
    let v14: s2 = v28[0]
    let v16: s0 = v14.p1
    let v29: [[Double]] = v16.p1
    let v40: [Double] = v29[0]
    let v107: Double = v40[0]
    let v94: Double = v8 / v107
    return v94
  }
  func benchmark() {
    let v0: [[s2]] = [[s2(p0: [s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0]]), p1: s0(p0: [[3.0]], p1: [[4.0], [5.0]]))], p1: s0(p0: [[6.0]], p1: [[7.0], [8.0]]))]]
    let v1: Double = 9.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 9.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
