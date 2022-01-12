  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f24(_ v0: s0) -> s0 {
    let v3: [[Double]] = v0.p0
    let v4: [[Double]] = v0.p1
    let v13: s0 = s0(p0: v3, p1: v4)
    return v13
  }
  func f22(_ v0: s0) -> s0 {
    let v1: s0 = f24(v0)
    let v2: s0 = f24(v1)
    let v3: [[Double]] = v0.p0
    var v5: [[Double]] = v3
    let v6: [Double] = v5[1]
    v5[0] = v6
    let v9: s0 = f24(v2)
    let v11: [[Double]] = v2.p0
    v5[2] = v6
    let v16: s0 = f24(v9)
    let v12: s0 = f24(v0)
    let v8: s0 = f24(v12)
    v5[1] = v6
    var v19: [Double] = v6
    let v26: s0 = f24(v8)
    var v28: s0 = v26
    v28.p0 = v11
    v5[2] = v19
    let v27: [[Double]] = v16.p0
    v28.p0 = v5
    v28.p0 = v27
    v5[1] = v6
    v28.p0 = v27
    let v41: s0 = f24(v28)
    let v43: s0 = f24(v16)
    let v70: [[Double]] = v43.p1
    v28.p1 = v70
    return v41
  }
  func f21(_ v0: [[s0]]) -> [[s0]] {
    var v4: [[s0]] = v0
    let v3: [[[s0]]] = [v4, v0, v4, v0, v0, v0, v4]
    let v15: [[s0]] = v3[0]
    return v15
  }
  func f20(_ v0: s0) -> s0 {
    let v3: s0 = f22(v0)
    var v2: s0 = v0
    var v10: s0 = v0
    var v5: s0 = v0
    let v1: s0 = f22(v0)
    let v4: [[Double]] = v0.p1
    let v8: [[Double]] = v3.p1
    let v6: [[Double]] = v10.p1
    let v20: s0 = f22(v10)
    let v11: s0 = f24(v1)
    v10.p1 = v4
    v5 = v20
    let v12: s0 = f24(v5)
    let v19: [[Double]] = v3.p0
    v5.p1 = v6
    let v14: s0 = f22(v1)
    let v24: [[Double]] = v11.p1
    v5.p1 = v24
    let v25: s0 = f22(v2)
    v2.p1 = v6
    v2.p0 = v19
    let v68: s0 = f24(v12)
    let v28: [[Double]] = v2.p0
    let v48: [[Double]] = v14.p1
    v2.p1 = v8
    let v58: [[Double]] = v10.p0
    v5.p0 = v28
    v5 = v25
    v10.p0 = v28
    v10.p1 = v48
    v2.p0 = v58
    return v68
  }
  func f15(_ v0: s0, _ v1: [s0]) -> [s0] {
    return v1
  }
  func f13(_ v0: s0) -> s0 {
    let v3: s0 = f22(v0)
    let v5: s0 = f22(v0)
    let v1: [s0] = [v3, v0, v3, v3, v3, v3]
    let v2: s0 = v1[5]
    var v8: [s0] = v1
    v8 = v1
    var v10: [s0] = v8
    let v7: s0 = v1[4]
    var v13: [s0] = v8
    v10[5] = v7
    var v6: [s0] = v1
    v6[4] = v3
    var v12: [s0] = v1
    let v16: s0 = v6[5]
    let v26: s0 = v12[2]
    let v9: s0 = v8[5]
    let v28: [[Double]] = v2.p1
    var v17: s0 = v5
    v10 = v12
    var v19: [[Double]] = v28
    var v33: s0 = v16
    let v23: [[Double]] = v9.p1
    let v20: s0 = v13[5]
    let v29: s0 = f22(v26)
    var v30: s0 = v16
    v17.p1 = v19
    var v46: s0 = v30
    let v48: s0 = v10[3]
    let v22: [[Double]] = v33.p1
    v46.p1 = v23
    v33.p1 = v22
    let v35: [s0] = [v29, v48, v20, v33]
    let v56: [Double] = v19[0]
    let v25: [[Double]] = v46.p0
    v13[4] = v16
    v17.p1 = v23
    v30.p0 = v25
    var v50: [s0] = v35
    var v89: [[Double]] = v19
    v17.p0 = v25
    v46.p1 = v89
    var v102: [s0] = v10
    v89[0] = v56
    let v134: [[Double]] = v5.p1
    let v60: s0 = f20(v3)
    v12[3] = v60
    let v78: s0 = v102[2]
    v8[4] = v78
    v10[1] = v17
    let v85: s0 = f20(v48)
    v17.p1 = v134
    v50[3] = v2
    v12[3] = v85
    let v122: s0 = v50[1]
    return v122
  }
  func f6(_ v0: [s0]) -> [s0] {
    var v4: [s0] = v0
    let v6: s0 = v4[0]
    let v2: s0 = f13(v6)
    let v5: [[Double]] = v2.p1
    let v7: s0 = f24(v2)
    var v9: s0 = v6
    var v3: s0 = v7
    v4[0] = v3
    let v15: s0 = f22(v7)
    let v8: s0 = f13(v15)
    v4[0] = v8
    let v14: s0 = f20(v7)
    let v40: [[Double]] = v8.p0
    v3.p0 = v40
    let v29: s0 = f13(v6)
    var v19: [s0] = v4
    let v24: [[Double]] = v29.p1
    v9.p1 = v5
    let v36: s0 = f24(v9)
    let v39: [[Double]] = v8.p0
    let v31: s0 = f24(v3)
    v9.p0 = v39
    let v21: [[Double]] = v29.p0
    let v30: [[Double]] = v15.p1
    let v46: [[Double]] = v9.p0
    let v64: [s0] = f15(v14, v19)
    v4[0] = v36
    v4 = v0
    v3.p1 = v24
    v4[0] = v31
    v9.p1 = v30
    v9.p0 = v46
    let v69: s0 = f20(v7)
    v9.p0 = v21
    v4[0] = v69
    return v64
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: Double) -> Double {
    let v2: [[s0]] = f21(v0)
    let v7: [s0] = v2[0]
    let v19: [s0] = f6(v7)
    let v21: s0 = v19[0]
    let v23: [[Double]] = v21.p0
    let v80: [Double] = v23[0]
    let v215: Double = v80[0]
    return v215
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]])], [s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]])], [s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])]]
    let v1: Double = 12.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 12.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
