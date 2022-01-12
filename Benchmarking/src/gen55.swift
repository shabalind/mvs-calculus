  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
    var p2: [[s0]]
  }
  struct s2 {
    var p0: [s1]
    var p1: [Double]
  }
  func f68(_ v0: s2) -> s2 {
    let v2: [s1] = v0.p0
    let v4: [Double] = v0.p1
    let v8: [Double] = v0.p1
    let v5: [[Double]] = [v8, v8, v8, v8, v8, v8]
    var v6: [s1] = v2
    let v18: [s1] = v0.p0
    let v1: [Double] = v5[2]
    var v17: s2 = v0
    v17.p1 = v8
    v17.p1 = v1
    var v20: s2 = v17
    let v24: [Double] = v20.p1
    let v48: [Double] = v17.p1
    let v15: [Double] = v20.p1
    v20.p1 = v4
    let v40: [Double] = v17.p1
    v17.p1 = v40
    v17.p1 = v24
    v20.p0 = v18
    let v46: s2 = s2(p0: v6, p1: v15)
    v17.p1 = v48
    let v88: [s1] = v17.p0
    let v89: [s1] = v46.p0
    v17.p0 = v89
    v17.p0 = v88
    return v20
  }
  func f62(_ v0: s2) -> s2 {
    let v3: s2 = f68(v0)
    var v1: s2 = v3
    var v4: s2 = v0
    let v7: s2 = f68(v1)
    v4 = v7
    let v8: [Double] = v4.p1
    var v12: [Double] = v8
    v1.p1 = v12
    var v19: [Double] = v12
    v12 = v8
    let v29: Double = v19[0]
    v4.p1 = v19
    let v37: [s1] = v1.p0
    let v56: s2 = s2(p0: v37, p1: v8)
    v12[1] = v29
    let v39: s2 = f68(v56)
    return v39
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    let v4: s2 = f62(v0)
    let v2: [Double] = v4.p1
    var v16: [Double] = v2
    let v30: Double = v2[1]
    v16[0] = v1
    v16[0] = v30
    v16[1] = v30
    let v139: Double = v16[0]
    v16 = v2
    return v139
  }
  func benchmark() {
    let v0: s2 = s2(p0: [s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), p1: s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]]), p2: [[s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]])], [s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]])], [s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0], [24.0]])]])], p1: [25.0, 26.0])
    let v1: Double = 27.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 27.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
