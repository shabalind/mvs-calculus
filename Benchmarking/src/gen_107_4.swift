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
    var p0: [[s1]]
    var p1: s0
    var p2: s1
  }
  func f22(_ v0: [Double]) -> [Double] {
    var v4: [Double] = v0
    var v2: [Double] = v4
    let v6: Double = v2[0]
    let v5: Double = v2[0]
    let v3: Double = v2[0]
    let v10: Double = v2[0]
    var v12: Double = v10
    var v16: Double = v12
    let v15: Double = v4[0]
    var v1: [Double] = v2
    var v9: [Double] = v4
    var v42: [Double] = v1
    v1[0] = v3
    let v23: [Double] = [v5, v16, v3, v3, v12]
    var v36: [Double] = v42
    let v17: Double = v6 / v15
    let v39: Double = v36[0]
    v1 = v9
    var v37: [Double] = v23
    var v56: [Double] = v37
    let v54: Double = v23[4]
    let v45: Double = v37[2]
    let v28: Double = v56[3]
    var v67: [Double] = v56
    v1[0] = v54
    let v60: Double = v37[0]
    let v68: Double = v56[0]
    v37[3] = v39
    let v102: Double = v37[2]
    let v74: [Double] = [v68, v60, v54, v102, v28, v17]
    let v71: [[Double]] = [v74, v74, v74, v74, v74, v74]
    let v84: [Double] = v71[5]
    v9[0] = v12
    let v92: Double = v84[3]
    v16 = v45
    let v157: Double = v67[1]
    var v129: [Double] = v2
    v4[0] = v92
    v129[0] = v157
    return v129
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: Double) -> Double {
    let v7: s2 = v0[0]
    let v4: s0 = v7.p1
    let v5: [[Double]] = v4.p1
    let v11: [Double] = v5[0]
    var v23: [Double] = v11
    let v16: [Double] = f22(v23)
    let v15: [Double] = f22(v16)
    let v67: Double = v23[0]
    let v43: Double = v15[0]
    let v37: Double = v43 - v67
    let v97: Double = v16[0]
    var v79: Double = v37
    v23[0] = v97
    return v79
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: [[s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]]), p1: s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]]), p2: [[s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]])], [s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]])]])]], p1: s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]]), p2: s1(p0: s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0], [35.0]]), p1: s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0], [40.0], [41.0]]), p2: [[s0(p0: [[42.0], [43.0], [44.0]], p1: [[45.0], [46.0], [47.0]])], [s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0], [52.0], [53.0]])]]))]
    let v1: Double = 54.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 54.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
