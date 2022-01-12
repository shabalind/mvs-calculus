  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s2 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s3 {
    var p0: s1
    var p1: s0
  }
  struct s7 {
    var p0: s3
    var p1: s2
  }
  struct s8 {
    var p0: s0
    var p1: [s7]
  }
  func f86(_ v0: Double) -> Double {
    var v1: Double = v0
    var v8: Double = v0
    var v2: Double = v1
    var v5: Double = v0
    var v7: Double = v2
    var v4: Double = v2
    var v6: Double = v0
    let v3: Double = v8 / v8
    v2 = v4
    var v9: Double = v7
    var v11: Double = v9
    var v33: Double = v5
    var v13: Double = v3
    var v12: Double = v8
    var v16: Double = v33
    var v39: Double = v12
    let v29: [Double] = [v7]
    let v10: Double = v29[0]
    let v18: Double = v29[0]
    var v15: [Double] = v29
    let v21: Double = v15[0]
    let v17: Double = v15[0]
    var v32: Double = v21
    var v61: [Double] = v29
    var v26: [Double] = v61
    v15[0] = v2
    v15[0] = v9
    let v28: Double = v29[0]
    var v27: Double = v17
    v26[0] = v2
    v15[0] = v13
    let v84: Double = v26[0]
    var v69: [Double] = v15
    var v31: [Double] = v69
    var v46: Double = v39
    v31[0] = v4
    let v54: Double = v15[0]
    let v35: Double = v31[0]
    v26[0] = v32
    v26[0] = v13
    let v90: Double = v61[0]
    v69[0] = v18
    let v119: Double = v84 / v54
    let v42: Double = v10 - v54
    let v44: Double = v61[0]
    v61[0] = v28
    var v50: [Double] = v69
    v26[0] = v16
    let v71: Double = v26[0]
    v15[0] = v6
    var v66: [Double] = v50
    var v68: [Double] = v61
    v39 = v27
    v66[0] = v11
    let v128: Double = v50[0]
    v15[0] = v21
    let v41: [Double] = [v46, v90, v119, v42, v44, v6]
    v15[0] = v35
    v15[0] = v128
    let v108: [[Double]] = [v41, v41]
    v66[0] = v128
    var v96: [[Double]] = v108
    var v278: [[Double]] = v96
    v61 = v68
    var v109: [Double] = v41
    var v63: [Double] = v109
    v69[0] = v21
    let v122: Double = v109[1]
    v26 = v66
    let v215: [Double] = v278[1]
    let v91: [Double] = v96[0]
    let v100: [Double] = v108[1]
    v109 = v91
    let v228: Double = v100[5]
    let v116: Double = v66[0]
    v63 = v215
    v31[0] = v122
    let v176: Double = v63[3]
    v31[0] = v32
    v66[0] = v116
    var v173: Double = v228
    v109[2] = v71
    v69[0] = v176
    return v173
  }
  @inline(never)
  func f0(_ v0: s8, _ v1: Double) -> Double {
    let v2: Double = f86(v1)
    let v6: s0 = v0.p0
    let v11: [[Double]] = v6.p0
    let v12: Double = v1 * v2
    let v4: Double = v1 / v12
    var v15: Double = v4
    v15 = v12
    let v23: [Double] = v11[0]
    var v44: [[Double]] = v11
    let v61: [Double] = v44[0]
    v44[1] = v61
    let v50: Double = v61[0]
    let v31: [[Double]] = v6.p0
    let v30: [Double] = v31[1]
    v44[1] = v23
    var v42: Double = v15
    let v89: Double = v1 / v42
    v44[0] = v30
    v42 = v50
    return v89
  }
  func benchmark() {
    let v0: s8 = s8(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), p1: [s7(p0: s3(p0: s1(p0: s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]]), p1: [s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]]), s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]])]), p1: s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0], [24.0]])), p1: s2(p0: [s0(p0: [[25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])], p1: [s0(p0: [[30.0], [31.0]], p1: [[32.0], [33.0], [34.0]]), s0(p0: [[35.0], [36.0]], p1: [[37.0], [38.0], [39.0]])]))])
    let v1: Double = 40.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 40.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
