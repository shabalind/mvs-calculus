  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [s0]
  }
  struct s2 {
    var p0: s1
    var p1: [s1]
  }
  struct s3 {
    var p0: s2
    var p1: [s0]
  }
  struct s4 {
    var p0: s2
    var p1: s2
  }
  func f87(_ v0: s3, _ v1: s3, _ v2: s3) -> s3 {
    let v7: s2 = v0.p0
    var v6: s2 = v7
    var v9: s3 = v0
    let v4: [s1] = v6.p1
    let v3: [[s1]] = [v4, v4, v4, v4, v4]
    var v13: s2 = v7
    v9.p0 = v7
    var v8: s3 = v9
    var v10: [s1] = v4
    let v14: s2 = v2.p0
    let v12: [s1] = v3[3]
    let v29: s1 = v14.p0
    v10[2] = v29
    var v37: s2 = v13
    var v19: s2 = v14
    let v26: s1 = v6.p0
    v37.p0 = v29
    var v35: s3 = v8
    let v27: s1 = v10[1]
    v19.p1 = v12
    let v54: [s0] = v8.p1
    var v40: s1 = v27
    v9 = v2
    v13.p1 = v10
    v19.p0 = v40
    v8.p0 = v37
    let v44: [s2] = [v19, v7, v7, v6, v13]
    let v49: s2 = v35.p0
    let v20: s2 = v44[4]
    v35.p0 = v49
    v35.p1 = v54
    let v65: [s0] = v26.p1
    v19.p0 = v40
    let v68: s2 = v35.p0
    v13.p0 = v27
    v6 = v20
    let v55: s1 = v4[2]
    v8.p0 = v68
    v40.p1 = v65
    let v96: s2 = v8.p0
    v37.p1 = v10
    let v117: [s1] = v96.p1
    v10 = v117
    v40 = v55
    v35.p0 = v49
    let v75: s1 = v96.p0
    v8 = v9
    let v118: [s0] = v75.p1
    v19.p1 = v4
    v40.p1 = v65
    v6.p0 = v40
    v40.p1 = v118
    return v8
  }
  func f86(_ v0: s3, _ v1: s4, _ v2: s2) -> s4 {
    var v21: s4 = v1
    return v21
  }
  func f85(_ v0: s3) -> s3 {
    let v5: s3 = f87(v0, v0, v0)
    let v4: s3 = f87(v5, v5, v0)
    var v2: s3 = v0
    var v3: s3 = v0
    v2 = v4
    let v1: [s0] = v3.p1
    let v8: s3 = f87(v5, v0, v5)
    v3.p1 = v1
    let v14: s3 = f87(v2, v3, v5)
    var v11: s3 = v4
    let v17: s3 = f87(v0, v0, v2)
    let v22: s3 = f87(v0, v14, v0)
    let v21: s2 = v5.p0
    var v16: s2 = v21
    let v47: s3 = f87(v8, v11, v4)
    let v19: s3 = f87(v47, v3, v8)
    v3 = v47
    v2.p1 = v1
    v3 = v47
    let v24: s3 = f87(v4, v22, v3)
    let v28: [s0] = v17.p1
    var v45: s3 = v4
    let v49: s3 = f87(v14, v3, v11)
    let v40: s3 = f87(v14, v8, v19)
    let v34: [s0] = v0.p1
    let v43: s3 = f87(v40, v24, v11)
    var v58: s2 = v16
    v58 = v21
    let v78: s3 = f87(v11, v3, v17)
    let v57: s3 = f87(v47, v3, v78)
    v45.p0 = v21
    let v32: s3 = f87(v43, v4, v8)
    let v79: s3 = f87(v57, v47, v43)
    let v102: s3 = f87(v5, v40, v11)
    v45.p1 = v34
    let v77: s3 = f87(v8, v8, v14)
    var v170: [s0] = v28
    v45.p0 = v58
    let v70: s3 = f87(v57, v79, v22)
    let v111: s3 = f87(v77, v32, v49)
    let v129: s3 = f87(v43, v77, v102)
    let v130: s3 = f87(v70, v129, v47)
    let v122: s3 = f87(v102, v0, v111)
    var v200: s3 = v47
    v200.p1 = v170
    let v142: s3 = f87(v45, v122, v200)
    let v216: s3 = f87(v130, v70, v142)
    return v216
  }
  func f77(_ v0: s3) -> s3 {
    let v3: s2 = v0.p0
    let v1: s3 = f85(v0)
    var v6: s3 = v1
    v6.p0 = v3
    let v8: s4 = s4(p0: v3, p1: v3)
    let v15: s4 = f86(v0, v8, v3)
    let v49: s2 = v15.p0
    v6.p0 = v49
    return v6
  }
  func f35(_ v0: s3) -> s3 {
    let v4: s3 = f77(v0)
    var v5: s3 = v4
    var v6: s3 = v5
    let v7: s3 = f87(v0, v0, v6)
    let v1: s3 = f87(v6, v7, v5)
    return v1
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: [[s3]], _ v2: s1, _ v3: s2, _ v4: Double) -> Double {
    let v6: [s3] = v1[0]
    let v17: s3 = v6[0]
    let v9: [s3] = v1[0]
    let v15: s3 = f35(v17)
    var v34: s3 = v15
    v34.p0 = v3
    let v21: s3 = v9[0]
    let v61: [s0] = v34.p1
    v34.p0 = v3
    var v104: s3 = v21
    let v66: s0 = v61[1]
    let v80: [[Double]] = v66.p0
    let v101: [Double] = v80[0]
    let v109: Double = v101[0]
    let v127: Double = v4 - v4
    let v108: [s0] = v104.p1
    v104 = v15
    let v135: Double = v109 + v127
    v34.p1 = v108
    return v135
  }
  func benchmark() {
    let v0: s3 = s3(p0: s2(p0: s1(p0: [[s0(p0: [[0.0]], p1: [[1.0], [2.0]])]], p1: [s0(p0: [[3.0]], p1: [[4.0], [5.0]]), s0(p0: [[6.0]], p1: [[7.0], [8.0]])]), p1: [s1(p0: [[s0(p0: [[9.0]], p1: [[10.0], [11.0]])]], p1: [s0(p0: [[12.0]], p1: [[13.0], [14.0]]), s0(p0: [[15.0]], p1: [[16.0], [17.0]])]), s1(p0: [[s0(p0: [[18.0]], p1: [[19.0], [20.0]])]], p1: [s0(p0: [[21.0]], p1: [[22.0], [23.0]]), s0(p0: [[24.0]], p1: [[25.0], [26.0]])]), s1(p0: [[s0(p0: [[27.0]], p1: [[28.0], [29.0]])]], p1: [s0(p0: [[30.0]], p1: [[31.0], [32.0]]), s0(p0: [[33.0]], p1: [[34.0], [35.0]])])]), p1: [s0(p0: [[36.0]], p1: [[37.0], [38.0]]), s0(p0: [[39.0]], p1: [[40.0], [41.0]]), s0(p0: [[42.0]], p1: [[43.0], [44.0]])])
    let v1: [[s3]] = [[s3(p0: s2(p0: s1(p0: [[s0(p0: [[45.0]], p1: [[46.0], [47.0]])]], p1: [s0(p0: [[48.0]], p1: [[49.0], [50.0]]), s0(p0: [[51.0]], p1: [[52.0], [53.0]])]), p1: [s1(p0: [[s0(p0: [[54.0]], p1: [[55.0], [56.0]])]], p1: [s0(p0: [[57.0]], p1: [[58.0], [59.0]]), s0(p0: [[60.0]], p1: [[61.0], [62.0]])]), s1(p0: [[s0(p0: [[63.0]], p1: [[64.0], [65.0]])]], p1: [s0(p0: [[66.0]], p1: [[67.0], [68.0]]), s0(p0: [[69.0]], p1: [[70.0], [71.0]])]), s1(p0: [[s0(p0: [[72.0]], p1: [[73.0], [74.0]])]], p1: [s0(p0: [[75.0]], p1: [[76.0], [77.0]]), s0(p0: [[78.0]], p1: [[79.0], [80.0]])])]), p1: [s0(p0: [[81.0]], p1: [[82.0], [83.0]]), s0(p0: [[84.0]], p1: [[85.0], [86.0]]), s0(p0: [[87.0]], p1: [[88.0], [89.0]])])]]
    let v2: s1 = s1(p0: [[s0(p0: [[90.0]], p1: [[91.0], [92.0]])]], p1: [s0(p0: [[93.0]], p1: [[94.0], [95.0]]), s0(p0: [[96.0]], p1: [[97.0], [98.0]])])
    let v3: s2 = s2(p0: s1(p0: [[s0(p0: [[99.0]], p1: [[100.0], [101.0]])]], p1: [s0(p0: [[102.0]], p1: [[103.0], [104.0]]), s0(p0: [[105.0]], p1: [[106.0], [107.0]])]), p1: [s1(p0: [[s0(p0: [[108.0]], p1: [[109.0], [110.0]])]], p1: [s0(p0: [[111.0]], p1: [[112.0], [113.0]]), s0(p0: [[114.0]], p1: [[115.0], [116.0]])]), s1(p0: [[s0(p0: [[117.0]], p1: [[118.0], [119.0]])]], p1: [s0(p0: [[120.0]], p1: [[121.0], [122.0]]), s0(p0: [[123.0]], p1: [[124.0], [125.0]])]), s1(p0: [[s0(p0: [[126.0]], p1: [[127.0], [128.0]])]], p1: [s0(p0: [[129.0]], p1: [[130.0], [131.0]]), s0(p0: [[132.0]], p1: [[133.0], [134.0]])])])
    let v4: Double = 135.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 135.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
