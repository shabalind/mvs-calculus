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
    var p1: [s0]
  }
  func f11(_ v0: Double) -> Double {
    var v1: Double = v0
    var v7: Double = v1
    var v6: Double = v0
    v1 = v7
    var v2: Double = v6
    var v4: Double = v0
    let v3: [Double] = [v0, v4]
    var v10: Double = v7
    var v5: Double = v6
    var v13: Double = v2
    var v17: [Double] = v3
    var v11: [Double] = v3
    let v21: Double = v3[0]
    let v14: Double = v17[0]
    var v16: [Double] = v17
    var v46: [Double] = v3
    v2 = v13
    v16[0] = v1
    let v12: Double = v11[0]
    var v27: Double = v7
    v11[1] = v27
    v17[1] = v14
    var v38: [Double] = v3
    let v28: [[Double]] = [v17, v3, v46, v38, v17, v16]
    v46[1] = v21
    v46 = v16
    v6 = v10
    let v69: [Double] = v28[3]
    let v75: Double = v5 * v2
    v7 = v75
    v46[1] = v12
    let v37: Double = v69[1]
    return v37
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: s2, _ v2: Double) -> Double {
    let v8: Double = f11(v2)
    let v17: Double = v8 * v8
    return v17
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), p1: s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]])), s1(p0: s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]]), p1: s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]])), s1(p0: s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]]), p1: s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0], [29.0]]))]
    let v1: s2 = s2(p0: [s1(p0: s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0]]), p1: s0(p0: [[35.0], [36.0], [37.0]], p1: [[38.0], [39.0]])), s1(p0: s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0], [44.0]]), p1: s0(p0: [[45.0], [46.0], [47.0]], p1: [[48.0], [49.0]])), s1(p0: s0(p0: [[50.0], [51.0], [52.0]], p1: [[53.0], [54.0]]), p1: s0(p0: [[55.0], [56.0], [57.0]], p1: [[58.0], [59.0]]))], p1: [s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0], [64.0]])])
    let v2: Double = 65.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 65.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
