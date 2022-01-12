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
    var p0: s1
    var p1: [s1]
  }
  func f23(_ v0: s1) -> s1 {
    var v3: s1 = v0
    var v6: s1 = v0
    var v4: s1 = v3
    let v8: s0 = v6.p0
    var v2: s1 = v3
    v6 = v3
    let v1: [[Double]] = v8.p0
    let v5: s0 = v6.p0
    v2.p1 = v8
    v4.p0 = v5
    let v7: s0 = v4.p1
    var v9: s0 = v7
    var v13: s0 = v9
    v2.p1 = v9
    v3.p1 = v8
    v13.p1 = v1
    v4.p0 = v8
    v13.p1 = v1
    v6.p0 = v13
    return v2
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    let v4: s1 = v0.p0
    let v8: s1 = f23(v4)
    let v17: s0 = v8.p1
    let v35: [[Double]] = v17.p1
    let v45: [Double] = v35[1]
    let v98: Double = v45[0]
    return v98
  }
  func benchmark() {
    let v0: s2 = s2(p0: s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), p1: s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]])), p1: [s1(p0: s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]]), p1: s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]])), s1(p0: s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]]), p1: s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]])), s1(p0: s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]]), p1: s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]]))])
    let v1: Double = 32.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 32.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
