  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: [[Double]], _ v2: Double) -> Double {
    let v7: [Double] = v1[0]
    let v9: [Double] = v1[0]
    let v3: Double = v9[0]
    let v10: Double = v9[0]
    let v11: Double = v7[0]
    let v6: Double = v7[0]
    let v29: [Double] = v1[0]
    let v69: Double = v29[0]
    var v37: [Double] = v7
    v37[0] = v3
    var v43: Double = v6
    let v57: Double = v37[0]
    let v116: Double = v57 / v11
    v37[0] = v43
    v37[0] = v69
    var v79: Double = v10
    v37[0] = v79
    return v116
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), p1: [s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]])])
    let v1: [[Double]] = [[10.0]]
    let v2: Double = 11.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 11.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
