  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: s0
    var p1: [s0]
  }
  struct s3 {
    var p0: s0
    var p1: s0
  }
  struct s4 {
    var p0: s0
    var p1: [s0]
  }
  struct s5 {
    var p0: s2
    var p1: s0
  }
  struct s9 {
    var p0: [s5]
    var p1: s0
  }
  struct s11 {
    var p0: s9
    var p1: [s3]
  }
  struct s14 {
    var p0: s11
    var p1: s5
  }
  func f30(_ v0: s0) -> s0 {
    var v7: s0 = v0
    let v8: [[Double]] = v7.p1
    var v1: s0 = v7
    v1.p0 = v8
    var v4: s0 = v1
    v1.p0 = v8
    v4.p0 = v8
    var v16: s0 = v4
    return v16
  }
  func f25(_ v0: s4, _ v1: Double) -> Double {
    let v6: s0 = v0.p0
    let v14: s0 = f30(v6)
    var v9: s0 = v14
    let v18: [[Double]] = v14.p0
    let v7: [[Double]] = v9.p1
    let v27: [[Double]] = v6.p1
    var v17: [[Double]] = v7
    let v16: [Double] = v18[0]
    var v15: [[Double]] = v17
    v17[0] = v16
    v9.p1 = v17
    v9.p0 = v27
    v17[0] = v16
    v17[0] = v16
    let v24: [Double] = v7[0]
    v15[0] = v24
    let v46: [Double] = v15[0]
    let v31: [Double] = v17[0]
    v17[0] = v24
    v15[0] = v31
    let v89: Double = v46[0]
    return v89
  }
  @inline(never)
  func f0(_ v0: [s4], _ v1: [[s14]], _ v2: [s3], _ v3: Double) -> Double {
    var v5: Double = v3
    let v6: s4 = v0[0]
    let v7: s4 = v0[0]
    let v4: [Double] = [v3, v3, v5, v3, v3, v3]
    var v10: [Double] = v4
    v10[2] = v5
    let v11: Double = f25(v6, v5)
    let v15: Double = f25(v6, v5)
    let v18: Double = v4[4]
    var v35: Double = v5
    let v25: Double = f25(v6, v18)
    let v42: Double = f25(v6, v35)
    let v57: s4 = v0[0]
    var v103: [Double] = v10
    var v102: [Double] = v10
    var v96: Double = v11
    v10[1] = v25
    let v98: Double = v42 - v96
    v103[3] = v11
    let v152: Double = v102[5]
    v103 = v102
    let v97: Double = f25(v7, v152)
    v10[1] = v98
    v103[2] = v3
    let v58: Double = v103[0]
    let v190: Double = f25(v57, v96)
    v103[0] = v25
    v10[5] = v190
    v103[1] = v15
    let v166: Double = v58 / v97
    return v166
  }
  func benchmark() {
    let v0: [s4] = [s4(p0: s0(p0: [[0.0]], p1: [[1.0]]), p1: [s0(p0: [[2.0]], p1: [[3.0]]), s0(p0: [[4.0]], p1: [[5.0]]), s0(p0: [[6.0]], p1: [[7.0]])])]
    let v1: [[s14]] = [[s14(p0: s11(p0: s9(p0: [s5(p0: s2(p0: s0(p0: [[8.0]], p1: [[9.0]]), p1: [s0(p0: [[10.0]], p1: [[11.0]]), s0(p0: [[12.0]], p1: [[13.0]])]), p1: s0(p0: [[14.0]], p1: [[15.0]]))], p1: s0(p0: [[16.0]], p1: [[17.0]])), p1: [s3(p0: s0(p0: [[18.0]], p1: [[19.0]]), p1: s0(p0: [[20.0]], p1: [[21.0]]))]), p1: s5(p0: s2(p0: s0(p0: [[22.0]], p1: [[23.0]]), p1: [s0(p0: [[24.0]], p1: [[25.0]]), s0(p0: [[26.0]], p1: [[27.0]])]), p1: s0(p0: [[28.0]], p1: [[29.0]])))]]
    let v2: [s3] = [s3(p0: s0(p0: [[30.0]], p1: [[31.0]]), p1: s0(p0: [[32.0]], p1: [[33.0]]))]
    let v3: Double = 34.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 34.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
