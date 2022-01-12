  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
  }
  struct s2 {
    var p0: [s1]
    var p1: s0
  }
  struct s3 {
    var p0: s0
    var p1: s1
  }
  struct s5 {
    var p0: s2
    var p1: s3
    var p2: s0
    var p3: s0
  }
  struct s10 {
    var p0: [s3]
    var p1: s5
  }
  func f86(_ v0: Double) -> Double {
    var v7: Double = v0
    var v4: Double = v7
    var v1: Double = v0
    var v2: Double = v0
    var v3: Double = v0
    var v14: Double = v2
    var v10: Double = v2
    var v18: Double = v1
    v4 = v14
    var v17: Double = v4
    var v35: Double = v10
    let v22: [Double] = [v17, v35, v3, v18]
    let v26: Double = v22[1]
    return v26
  }
  func f70(_ v0: Double) -> Double {
    var v3: Double = v0
    var v6: Double = v3
    let v5: Double = f86(v3)
    let v7: Double = f86(v0)
    var v8: Double = v5
    var v4: Double = v3
    var v13: Double = v8
    let v14: Double = f86(v7)
    let v25: Double = f86(v3)
    let v24: Double = f86(v13)
    var v33: Double = v24
    var v64: Double = v6
    let v35: Double = f86(v7)
    var v50: Double = v4
    var v57: Double = v25
    var v37: Double = v24
    let v29: [Double] = [v35, v33, v5, v57, v6, v37]
    let v49: Double = f86(v35)
    var v41: Double = v50
    let v56: Double = f86(v64)
    let v73: Double = v29[2]
    let v44: Double = v29[4]
    let v52: [Double] = [v49, v49, v14, v24, v44, v41]
    var v71: [Double] = v52
    var v87: Double = v56
    let v94: Double = v29[1]
    v71[4] = v94
    v71[1] = v64
    let v92: Double = v29[0]
    let v79: Double = v71[1]
    v71[5] = v87
    let v66: Double = v79 + v92
    v71[4] = v73
    return v66
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: s10, _ v2: Double) -> Double {
    var v4: Double = v2
    let v52: Double = v2 + v4
    let v42: Double = f70(v52)
    let v60: Double = f70(v42)
    return v60
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]]), s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]])])
    let v1: s10 = s10(p0: [s3(p0: s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]]), p1: s1(p0: [s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]]), s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]]), s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]])])), s3(p0: s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]]), p1: s1(p0: [s0(p0: [[32.0], [33.0]], p1: [[34.0], [35.0]]), s0(p0: [[36.0], [37.0]], p1: [[38.0], [39.0]]), s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0]])]))], p1: s5(p0: s2(p0: [s1(p0: [s0(p0: [[44.0], [45.0]], p1: [[46.0], [47.0]]), s0(p0: [[48.0], [49.0]], p1: [[50.0], [51.0]]), s0(p0: [[52.0], [53.0]], p1: [[54.0], [55.0]])]), s1(p0: [s0(p0: [[56.0], [57.0]], p1: [[58.0], [59.0]]), s0(p0: [[60.0], [61.0]], p1: [[62.0], [63.0]]), s0(p0: [[64.0], [65.0]], p1: [[66.0], [67.0]])])], p1: s0(p0: [[68.0], [69.0]], p1: [[70.0], [71.0]])), p1: s3(p0: s0(p0: [[72.0], [73.0]], p1: [[74.0], [75.0]]), p1: s1(p0: [s0(p0: [[76.0], [77.0]], p1: [[78.0], [79.0]]), s0(p0: [[80.0], [81.0]], p1: [[82.0], [83.0]]), s0(p0: [[84.0], [85.0]], p1: [[86.0], [87.0]])])), p2: s0(p0: [[88.0], [89.0]], p1: [[90.0], [91.0]]), p3: s0(p0: [[92.0], [93.0]], p1: [[94.0], [95.0]])))
    let v2: Double = 96.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 96.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
