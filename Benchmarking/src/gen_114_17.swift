  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f35(_ v0: Double) -> Double {
    var v7: Double = v0
    var v6: Double = v0
    let v1: Double = v7 * v0
    var v8: Double = v1
    var v3: Double = v1
    var v5: Double = v8
    var v12: Double = v8
    v8 = v12
    var v13: Double = v3
    var v9: Double = v5
    var v14: Double = v12
    var v29: Double = v5
    var v21: Double = v12
    var v27: Double = v8
    var v15: Double = v6
    var v45: Double = v13
    var v39: Double = v0
    var v32: Double = v3
    let v43: [Double] = [v32, v8, v14, v45, v9, v14]
    var v42: Double = v21
    var v30: [Double] = v43
    v30[5] = v6
    let v20: Double = v43[2]
    var v19: [Double] = v30
    var v22: Double = v39
    var v46: [Double] = v19
    var v54: Double = v20
    var v31: [Double] = v46
    var v71: [Double] = v46
    let v66: Double = v31[0]
    v46[2] = v3
    let v38: [[Double]] = [v30, v31, v71]
    v3 = v27
    let v41: [Double] = v38[2]
    v19[5] = v42
    var v26: [[Double]] = v38
    v31[4] = v15
    v46[0] = v14
    v71[5] = v21
    var v115: [[Double]] = v26
    v26[2] = v30
    var v85: [[Double]] = v26
    var v124: [[Double]] = v115
    var v90: Double = v45
    v71[0] = v66
    let v80: [Double] = v26[0]
    v71 = v43
    v85[2] = v80
    let v57: [[[Double]]] = [v124, v26, v85, v85, v124, v85, v38]
    var v169: Double = v22
    v46[4] = v29
    v26[1] = v30
    v30[2] = v90
    let v123: [[Double]] = v57[0]
    v71[2] = v169
    let v107: [Double] = v123[1]
    v46[0] = v54
    let v93: Double = v41[0]
    v71[4] = v93
    let v105: Double = v107[5]
    return v105
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: [[s0]], _ v2: Double) -> Double {
    let v9: [Double] = [v2, v2, v2, v2]
    let v50: Double = v9[0]
    var v21: [Double] = v9
    var v16: [Double] = v21
    v21[3] = v50
    let v104: Double = v16[1]
    let v102: Double = f35(v104)
    return v102
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]]), s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])]
    let v1: [[s0]] = [[s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]])], [s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]])], [s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]])]]
    let v2: Double = 24.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 24.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
