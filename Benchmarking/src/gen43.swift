  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [Double]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s2 {
    var p0: s0
    var p1: s1
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    let v2: Double = v1 + v1
    var v8: Double = v2
    let v6: Double = v1 + v2
    let v18: [Double] = [v2, v8, v8]
    let v11: s0 = v0.p0
    var v16: [Double] = v18
    let v15: [s0] = [v11, v11, v11, v11, v11, v11, v11]
    v16[2] = v2
    let v10: Double = v16[1]
    let v17: Double = v16[0]
    let v21: Double = v10 / v17
    let v24: s0 = v15[2]
    v16[2] = v6
    v16[0] = v6
    let v22: [Double] = v24.p1
    v16[1] = v21
    v16 = v22
    return v17
  }
  func benchmark() {
    let v0: s2 = s2(p0: s0(p0: [[0.0], [1.0]], p1: [2.0, 3.0, 4.0]), p1: s1(p0: [s0(p0: [[5.0], [6.0]], p1: [7.0, 8.0, 9.0])], p1: [s0(p0: [[10.0], [11.0]], p1: [12.0, 13.0, 14.0]), s0(p0: [[15.0], [16.0]], p1: [17.0, 18.0, 19.0]), s0(p0: [[20.0], [21.0]], p1: [22.0, 23.0, 24.0])]))
    let v1: Double = 25.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 25.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
