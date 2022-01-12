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
    var p1: s1
  }
  func f3(_ v0: Double) -> Double {
    var v6: Double = v0
    var v2: Double = v6
    var v1: Double = v0
    var v7: Double = v1
    var v3: Double = v6
    var v4: Double = v3
    var v10: Double = v4
    var v8: Double = v4
    var v21: Double = v10
    var v13: Double = v4
    var v14: Double = v6
    let v11: Double = v21 / v13
    var v27: Double = v14
    let v12: [Double] = [v7, v7, v6, v6, v21, v4, v11]
    var v23: [Double] = v12
    v23[4] = v4
    v23[3] = v14
    let v29: Double = v23[5]
    let v33: Double = v23[6]
    v23[2] = v8
    var v34: Double = v2
    let v19: Double = v12[1]
    v23[0] = v10
    v14 = v29
    v23[6] = v7
    let v64: [Double] = [v33, v1, v11, v34, v4, v27]
    v27 = v33
    v23[4] = v33
    var v53: [Double] = v64
    var v86: [Double] = v53
    v53[4] = v19
    v23[0] = v10
    let v126: Double = v86[1]
    return v126
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: [Double], _ v2: [s1], _ v3: [s2], _ v4: Double) -> Double {
    var v12: [Double] = v1
    v12 = v1
    var v18: Double = v4
    let v28: Double = v12[0]
    var v16: [Double] = v1
    v16[0] = v4
    let v41: Double = f3(v4)
    v12[0] = v4
    v16[1] = v18
    v12 = v1
    v12[0] = v41
    v16[1] = v28
    var v50: [Double] = v1
    v12 = v50
    let v52: Double = f3(v41)
    let v131: Double = f3(v52)
    var v157: [Double] = v16
    let v96: Double = v157[1]
    v16[1] = v131
    return v96
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0]]), s0(p0: [[3.0]], p1: [[4.0], [5.0]])], p1: s0(p0: [[6.0]], p1: [[7.0], [8.0]])), s1(p0: [s0(p0: [[9.0]], p1: [[10.0], [11.0]]), s0(p0: [[12.0]], p1: [[13.0], [14.0]])], p1: s0(p0: [[15.0]], p1: [[16.0], [17.0]]))]
    let v1: [Double] = [18.0, 19.0]
    let v2: [s1] = [s1(p0: [s0(p0: [[20.0]], p1: [[21.0], [22.0]]), s0(p0: [[23.0]], p1: [[24.0], [25.0]])], p1: s0(p0: [[26.0]], p1: [[27.0], [28.0]]))]
    let v3: [s2] = [s2(p0: s1(p0: [s0(p0: [[29.0]], p1: [[30.0], [31.0]]), s0(p0: [[32.0]], p1: [[33.0], [34.0]])], p1: s0(p0: [[35.0]], p1: [[36.0], [37.0]])), p1: s1(p0: [s0(p0: [[38.0]], p1: [[39.0], [40.0]]), s0(p0: [[41.0]], p1: [[42.0], [43.0]])], p1: s0(p0: [[44.0]], p1: [[45.0], [46.0]]))), s2(p0: s1(p0: [s0(p0: [[47.0]], p1: [[48.0], [49.0]]), s0(p0: [[50.0]], p1: [[51.0], [52.0]])], p1: s0(p0: [[53.0]], p1: [[54.0], [55.0]])), p1: s1(p0: [s0(p0: [[56.0]], p1: [[57.0], [58.0]]), s0(p0: [[59.0]], p1: [[60.0], [61.0]])], p1: s0(p0: [[62.0]], p1: [[63.0], [64.0]]))), s2(p0: s1(p0: [s0(p0: [[65.0]], p1: [[66.0], [67.0]]), s0(p0: [[68.0]], p1: [[69.0], [70.0]])], p1: s0(p0: [[71.0]], p1: [[72.0], [73.0]])), p1: s1(p0: [s0(p0: [[74.0]], p1: [[75.0], [76.0]]), s0(p0: [[77.0]], p1: [[78.0], [79.0]])], p1: s0(p0: [[80.0]], p1: [[81.0], [82.0]])))]
    let v4: Double = 83.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 83.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
