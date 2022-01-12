  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
    var p2: s0
    var p3: s0
    var p4: [s0]
    var p5: s0
    var p6: s0
    var p7: s0
  }
  struct s2 {
    var p0: s1
  }
  @inline(never)
  func f0(_ v0: [[s1]], _ v1: Double) -> Double {
    var v2: [[s1]] = v0
    let v7: [s1] = v2[0]
    v2[0] = v7
    v2[0] = v7
    v2[0] = v7
    let v11: [s1] = v2[1]
    let v6: s1 = v7[0]
    let v4: s2 = s2(p0: v6)
    let v3: s1 = v11[0]
    let v9: [s1] = v0[1]
    let v18: [s1] = v2[0]
    let v21: [s1] = v2[0]
    v2 = v0
    var v14: s2 = v4
    let v20: s1 = v21[0]
    let v30: s0 = v3.p7
    v14.p0 = v20
    var v17: [s1] = v9
    v14.p0 = v3
    let v22: [[Double]] = v30.p0
    v2[0] = v17
    v2[1] = v18
    let v36: s1 = v17[0]
    var v48: s2 = v14
    let v35: s2 = s2(p0: v36)
    let v40: s1 = v4.p0
    let v61: s1 = v48.p0
    let v31: [Double] = v22[1]
    v17[0] = v61
    v17[0] = v40
    let v68: s1 = v4.p0
    v48 = v35
    v14.p0 = v68
    let v60: Double = v31[0]
    return v60
  }
  func benchmark() {
    let v0: [[s1]] = [[s1(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]])], p1: [s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]), s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])], p2: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]]), p3: s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]]), p4: [s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]])], p5: s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]]), p6: s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]]), p7: s0(p0: [[32.0], [33.0], [34.0]], p1: [[35.0]]))], [s1(p0: [s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0]])], p1: [s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0]]), s0(p0: [[44.0], [45.0], [46.0]], p1: [[47.0]])], p2: s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0]]), p3: s0(p0: [[52.0], [53.0], [54.0]], p1: [[55.0]]), p4: [s0(p0: [[56.0], [57.0], [58.0]], p1: [[59.0]])], p5: s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0]]), p6: s0(p0: [[64.0], [65.0], [66.0]], p1: [[67.0]]), p7: s0(p0: [[68.0], [69.0], [70.0]], p1: [[71.0]]))]]
    let v1: Double = 72.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 72.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
