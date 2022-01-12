  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [s0]
    var p2: [s0]
    var p3: s0
    var p4: [s0]
    var p5: s0
    var p6: s0
  }
  struct s2 {
    var p0: [s0]
    var p1: [s1]
  }
  struct s3 {
    var p0: s2
    var p1: s0
  }
  func f47(_ v0: s3, _ v1: s3) -> s3 {
    let v4: s2 = v0.p0
    let v5: [s0] = v4.p0
    var v7: s2 = v4
    let v6: s0 = v5[0]
    let v18: [s0] = v7.p0
    v7.p0 = v18
    v7.p0 = v5
    let v56: s3 = s3(p0: v7, p1: v6)
    return v56
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    let v5: s3 = f47(v0, v0)
    var v2: Double = v1
    let v7: [s3] = [v5]
    let v3: s3 = v7[0]
    let v11: s2 = v3.p0
    var v32: s2 = v11
    let v18: Double = v1 - v1
    let v24: [s1] = v32.p1
    let v22: s1 = v24[0]
    let v37: [s0] = v32.p0
    let v38: Double = v2 + v18
    v32.p0 = v37
    let v43: s0 = v22.p3
    let v63: [[Double]] = v43.p0
    v32.p1 = v24
    var v42: [s0] = v37
    let v48: [Double] = v63[2]
    let v36: Double = v48[0]
    v32.p0 = v42
    let v145: Double = v36 * v38
    return v145
  }
  func benchmark() {
    let v0: s3 = s3(p0: s2(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]])], p1: [s1(p0: [[s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]])]], p1: [s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]])], p2: [s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]]), s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]]), s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0], [29.0]])], p3: s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0]]), p4: [s0(p0: [[35.0], [36.0], [37.0]], p1: [[38.0], [39.0]]), s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0], [44.0]])], p5: s0(p0: [[45.0], [46.0], [47.0]], p1: [[48.0], [49.0]]), p6: s0(p0: [[50.0], [51.0], [52.0]], p1: [[53.0], [54.0]]))]), p1: s0(p0: [[55.0], [56.0], [57.0]], p1: [[58.0], [59.0]]))
    let v1: Double = 60.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 60.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
