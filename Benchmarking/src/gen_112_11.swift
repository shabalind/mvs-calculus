  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: s0
    var p2: s0
    var p3: Double
  }
  struct s5 {
    var p0: s2
    var p1: s2
  }
  @inline(never)
  func f0(_ v0: s5, _ v1: s2, _ v2: s1, _ v3: s1, _ v4: Double) -> Double {
    let v7: [s0] = v3.p0
    let v12: s0 = v7[0]
    let v14: s0 = v7[0]
    var v11: s0 = v12
    var v23: [s0] = v7
    let v10: [[Double]] = v11.p0
    let v18: s0 = v7[0]
    let v13: s0 = v7[0]
    let v9: [[Double]] = v13.p0
    v23[0] = v13
    v23[0] = v12
    v11 = v14
    let v19: s0 = v7[0]
    let v39: s0 = v7[0]
    let v64: s0 = v23[0]
    v23[0] = v18
    let v68: s0 = v7[0]
    v11.p0 = v10
    v23[0] = v19
    let v88: [[[Double]]] = [v10, v9]
    let v72: [[Double]] = v88[1]
    var v71: [[Double]] = v10
    v23[0] = v68
    let v120: [Double] = v71[0]
    v23[0] = v39
    let v107: Double = v120[0]
    v11 = v64
    v11.p0 = v72
    return v107
  }
  func benchmark() {
    let v0: s5 = s5(p0: s2(p0: s1(p0: [s0(p0: [[0.0]], p1: [[1.0]])], p1: s0(p0: [[2.0]], p1: [[3.0]])), p1: s0(p0: [[4.0]], p1: [[5.0]]), p2: s0(p0: [[6.0]], p1: [[7.0]]), p3: 8.0), p1: s2(p0: s1(p0: [s0(p0: [[9.0]], p1: [[10.0]])], p1: s0(p0: [[11.0]], p1: [[12.0]])), p1: s0(p0: [[13.0]], p1: [[14.0]]), p2: s0(p0: [[15.0]], p1: [[16.0]]), p3: 17.0))
    let v1: s2 = s2(p0: s1(p0: [s0(p0: [[18.0]], p1: [[19.0]])], p1: s0(p0: [[20.0]], p1: [[21.0]])), p1: s0(p0: [[22.0]], p1: [[23.0]]), p2: s0(p0: [[24.0]], p1: [[25.0]]), p3: 26.0)
    let v2: s1 = s1(p0: [s0(p0: [[27.0]], p1: [[28.0]])], p1: s0(p0: [[29.0]], p1: [[30.0]]))
    let v3: s1 = s1(p0: [s0(p0: [[31.0]], p1: [[32.0]])], p1: s0(p0: [[33.0]], p1: [[34.0]]))
    let v4: Double = 35.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 35.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
