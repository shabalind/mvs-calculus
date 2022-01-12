  import Dispatch
  struct s0 {
    var p0: [Double]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: s1
    var p2: [[s0]]
    var p3: [s1]
    var p4: s1
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: s2, _ v2: Double) -> Double {
    let v7: [Double] = [v2, v2, v2, v2, v2, v2]
    let v4: s1 = v0.p0
    let v8: s0 = v4.p0
    let v9: Double = v7[2]
    let v12: [Double] = v8.p0
    let v3: Double = v12[0]
    let v11: Double = v12[0]
    var v15: [Double] = v7
    v15[3] = v3
    let v20: Double = v12[0]
    let v17: Double = v12[0]
    v15[1] = v20
    v15[2] = v9
    var v21: [Double] = v12
    let v43: Double = v21[0]
    v15[5] = v11
    let v102: Double = v15[2]
    let v82: Double = v102 - v17
    v15[3] = v43
    return v82
  }
  func benchmark() {
    let v0: s2 = s2(p0: s1(p0: s0(p0: [0.0], p1: [[1.0]]), p1: s0(p0: [2.0], p1: [[3.0]])), p1: s1(p0: s0(p0: [4.0], p1: [[5.0]]), p1: s0(p0: [6.0], p1: [[7.0]])), p2: [[s0(p0: [8.0], p1: [[9.0]])], [s0(p0: [10.0], p1: [[11.0]])], [s0(p0: [12.0], p1: [[13.0]])]], p3: [s1(p0: s0(p0: [14.0], p1: [[15.0]]), p1: s0(p0: [16.0], p1: [[17.0]])), s1(p0: s0(p0: [18.0], p1: [[19.0]]), p1: s0(p0: [20.0], p1: [[21.0]]))], p4: s1(p0: s0(p0: [22.0], p1: [[23.0]]), p1: s0(p0: [24.0], p1: [[25.0]])))
    let v1: s2 = s2(p0: s1(p0: s0(p0: [26.0], p1: [[27.0]]), p1: s0(p0: [28.0], p1: [[29.0]])), p1: s1(p0: s0(p0: [30.0], p1: [[31.0]]), p1: s0(p0: [32.0], p1: [[33.0]])), p2: [[s0(p0: [34.0], p1: [[35.0]])], [s0(p0: [36.0], p1: [[37.0]])], [s0(p0: [38.0], p1: [[39.0]])]], p3: [s1(p0: s0(p0: [40.0], p1: [[41.0]]), p1: s0(p0: [42.0], p1: [[43.0]])), s1(p0: s0(p0: [44.0], p1: [[45.0]]), p1: s0(p0: [46.0], p1: [[47.0]]))], p4: s1(p0: s0(p0: [48.0], p1: [[49.0]]), p1: s0(p0: [50.0], p1: [[51.0]])))
    let v2: Double = 52.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 52.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
