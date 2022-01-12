  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f8(_ v0: s0) -> s0 {
    var v3: s0 = v0
    let v6: [[Double]] = v3.p0
    var v4: [[Double]] = v6
    let v7: [Double] = v4[1]
    let v5: [[Double]] = v3.p0
    let v1: [[Double]] = [v7, v7]
    v4[1] = v7
    let v9: Double = v7[0]
    v3.p0 = v6
    let v8: [[Double]] = v3.p1
    v4[1] = v7
    var v13: [Double] = v7
    let v14: [Double] = v6[0]
    let v10: [Double] = v1[1]
    v3.p1 = v8
    v4[0] = v14
    v13[0] = v9
    let v20: Double = v7[0]
    v4 = v6
    let v35: Double = v14[0]
    let v17: [[Double]] = v3.p0
    let v21: [[Double]] = v3.p1
    let v15: [[Double]] = v3.p1
    v13[0] = v9
    let v19: [[Double]] = v3.p1
    let v25: [Double] = v19[0]
    v3.p1 = v8
    let v60: [[Double]] = v3.p0
    v3.p0 = v1
    v3.p0 = v60
    v3.p0 = v17
    let v30: [[Double]] = v0.p1
    let v39: [Double] = v21[0]
    var v31: [[Double]] = v30
    let v42: Double = v35 * v20
    v4[1] = v25
    var v22: [Double] = v13
    var v36: [[Double]] = v15
    v3.p0 = v6
    var v24: Double = v9
    let v34: Double = v35 - v9
    let v50: [[[Double]]] = [v36, v15, v30, v8, v31, v31]
    v36[0] = v10
    v36[0] = v14
    var v32: [[Double]] = v31
    let v112: [[Double]] = v50[2]
    v31 = v32
    v3.p1 = v31
    let v87: Double = v10[0]
    let v74: [Double] = [v42, v24, v34, v20, v87]
    let v59: Double = v74[2]
    let v57: s0 = s0(p0: v5, p1: v112)
    v31[0] = v22
    v31[0] = v39
    v13[0] = v59
    v3.p1 = v21
    return v57
  }
  func f6(_ v0: s0, _ v1: s0, _ v2: [s0], _ v3: s0, _ v4: [s0], _ v5: s0, _ v6: s0, _ v7: s0) -> s0 {
    let v9: [[Double]] = v3.p1
    let v16: [[Double]] = v3.p0
    let v8: [[Double]] = v7.p1
    let v23: [[Double]] = v5.p0
    let v28: s0 = f8(v0)
    let v31: [Double] = v23[1]
    let v51: s0 = f8(v28)
    let v35: s0 = s0(p0: v23, p1: v9)
    let v91: s0 = f8(v51)
    let v76: [[Double]] = v35.p0
    let v60: s0 = s0(p0: v76, p1: v8)
    let v41: [[Double]] = v91.p1
    var v65: [[Double]] = v9
    var v197: s0 = v60
    v197.p1 = v41
    v197.p0 = v16
    v65[0] = v31
    v197.p1 = v65
    return v197
  }
  func f4(_ v0: [s0], _ v1: s0, _ v2: [s0], _ v3: s0, _ v4: [s0], _ v5: s0, _ v6: [s0], _ v7: [s0]) -> s0 {
    var v14: [s0] = v2
    let v9: s0 = f8(v3)
    let v10: s0 = f8(v5)
    let v8: [[Double]] = v10.p0
    let v15: [Double] = v8[1]
    v14[0] = v3
    var v36: [Double] = v15
    let v23: [[Double]] = v1.p0
    let v18: s0 = f8(v10)
    let v19: s0 = v6[0]
    let v20: s0 = f8(v9)
    let v28: s0 = f8(v10)
    let v46: s0 = v6[0]
    var v33: [[Double]] = v23
    v14[2] = v18
    var v42: [Double] = v36
    let v34: s0 = v14[2]
    let v31: [[Double]] = v28.p1
    let v24: [[Double]] = v34.p0
    v33[0] = v15
    let v40: s0 = f8(v19)
    var v25: s0 = v40
    v14[2] = v20
    let v32: [[Double]] = v5.p1
    v25 = v5
    let v85: [[Double]] = v25.p1
    var v91: [[Double]] = v85
    let v68: [[Double]] = v5.p1
    let v73: [[Double]] = v46.p0
    let v41: [[Double]] = v25.p0
    v25.p1 = v32
    v25.p1 = v68
    v25.p0 = v73
    let v82: s0 = s0(p0: v24, p1: v91)
    v91[0] = v42
    v25.p0 = v41
    v25.p1 = v31
    v25.p0 = v33
    return v82
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: [s0], _ v2: s0, _ v3: [s0], _ v4: Double) -> Double {
    var v8: [s0] = v0
    let v5: s0 = v8[0]
    let v9: [[Double]] = v5.p0
    let v10: s0 = v3[1]
    let v11: [[Double]] = v5.p0
    let v15: s0 = v8[0]
    let v6: [Double] = v11[0]
    let v27: s0 = v8[0]
    v8[0] = v15
    let v12: [[Double]] = v2.p1
    let v13: s0 = f6(v2, v15, v0, v5, v3, v15, v5, v2)
    let v30: s0 = s0(p0: v9, p1: v12)
    let v25: s0 = f4(v1, v15, v3, v2, v1, v27, v1, v1)
    var v21: s0 = v30
    let v16: [[Double]] = v10.p1
    let v40: [[Double]] = v13.p1
    let v23: Double = v6[0]
    let v24: Double = v23 + v4
    v21.p1 = v12
    v21.p1 = v40
    v21.p1 = v16
    let v43: [[Double]] = v25.p1
    v21.p1 = v43
    v21.p0 = v11
    v21.p1 = v43
    v8[0] = v21
    return v24
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0]], p1: [[2.0]])]
    let v1: [s0] = [s0(p0: [[3.0], [4.0]], p1: [[5.0]]), s0(p0: [[6.0], [7.0]], p1: [[8.0]])]
    let v2: s0 = s0(p0: [[9.0], [10.0]], p1: [[11.0]])
    let v3: [s0] = [s0(p0: [[12.0], [13.0]], p1: [[14.0]]), s0(p0: [[15.0], [16.0]], p1: [[17.0]]), s0(p0: [[18.0], [19.0]], p1: [[20.0]])]
    let v4: Double = 21.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 21.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
