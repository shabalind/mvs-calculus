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
    var p0: s0
  }
  struct s3 {
    var p0: s2
    var p1: s1
  }
  struct s5 {
    var p0: s0
    var p1: s2
  }
  struct s8 {
    var p0: [[s5]]
    var p1: s3
  }
  @inline(never)
  func f0(_ v0: s8, _ v1: Double) -> Double {
    var v8: Double = v1
    let v9: s3 = v0.p1
    let v20: s2 = v9.p0
    var v16: Double = v8
    let v33: s0 = v20.p0
    let v53: [[Double]] = v33.p1
    let v26: [Double] = v53[0]
    let v64: Double = v26[0]
    let v101: [Double] = v53[0]
    var v92: [Double] = v101
    v92[0] = v64
    v92[0] = v16
    v92 = v101
    let v67: Double = v92[0]
    let v165: Double = v67 * v67
    v92[0] = v64
    return v165
  }
  func benchmark() {
    let v0: s8 = s8(p0: [[s5(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0]]), p1: s2(p0: s0(p0: [[3.0], [4.0]], p1: [[5.0]])))]], p1: s3(p0: s2(p0: s0(p0: [[6.0], [7.0]], p1: [[8.0]])), p1: s1(p0: s0(p0: [[9.0], [10.0]], p1: [[11.0]]), p1: s0(p0: [[12.0], [13.0]], p1: [[14.0]]))))
    let v1: Double = 15.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 15.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
