  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: Double
    var p1: [s0]
  }
  struct s3 {
    var p0: [[s0]]
    var p1: [s0]
  }
  struct s5 {
    var p0: s3
    var p1: s0
  }
  func f44(_ v0: Double) -> Double {
    var v3: Double = v0
    var v5: Double = v0
    let v2: [Double] = [v3, v0]
    var v9: [Double] = v2
    let v7: Double = v2[0]
    let v4: Double = v2[0]
    let v1: Double = v9[0]
    var v12: [Double] = v2
    var v13: [Double] = v12
    v9[0] = v3
    v9[1] = v7
    var v25: Double = v4
    var v18: Double = v25
    var v19: Double = v1
    let v40: [Double] = [v25, v3, v0]
    var v39: [Double] = v12
    v39[1] = v5
    let v73: [[Double]] = [v39, v9]
    var v30: [Double] = v40
    let v44: Double = v40[1]
    v12[0] = v18
    var v51: [Double] = v30
    var v22: [Double] = v12
    v12[1] = v44
    var v49: [Double] = v51
    let v89: [Double] = v73[1]
    let v98: [Double] = v73[1]
    var v69: [Double] = v13
    v51[1] = v0
    let v82: Double = v69[0]
    let v60: [Double] = v73[1]
    var v121: [Double] = v22
    var v63: [Double] = v69
    var v99: [Double] = v63
    v121 = v39
    var v132: [Double] = v121
    let v147: Double = v49[1]
    let v117: Double = v51[0]
    v132[0] = v82
    v30[2] = v147
    v13[0] = v19
    let v92: [[Double]] = [v132, v89, v60, v99, v98, v89, v99]
    let v138: [Double] = v92[6]
    v9[0] = v18
    v132[0] = v117
    let v273: Double = v138[1]
    return v273
  }
  func f18(_ v0: Double) -> Double {
    let v2: Double = f44(v0)
    let v10: Double = f44(v2)
    let v12: Double = f44(v2)
    let v30: [Double] = [v0, v2, v10, v12, v0]
    var v27: [Double] = v30
    var v46: [Double] = v27
    let v86: Double = v46[0]
    return v86
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: s5, _ v2: s0, _ v3: s0, _ v4: Double) -> Double {
    let v14: Double = v0.p0
    let v23: Double = v14 * v14
    var v18: Double = v23
    let v35: Double = f18(v23)
    let v16: [[Double]] = v3.p1
    let v34: [Double] = v16[0]
    var v28: [Double] = v34
    let v39: Double = f18(v18)
    v28[0] = v35
    let v33: Double = v28[0]
    v28 = v34
    v28[0] = v39
    return v33
  }
  func benchmark() {
    let v0: s1 = s1(p0: 0.0, p1: [s0(p0: [[1.0], [2.0], [3.0]], p1: [[4.0]]), s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0]])])
    let v1: s5 = s5(p0: s3(p0: [[s0(p0: [[9.0], [10.0], [11.0]], p1: [[12.0]])], [s0(p0: [[13.0], [14.0], [15.0]], p1: [[16.0]])]], p1: [s0(p0: [[17.0], [18.0], [19.0]], p1: [[20.0]])]), p1: s0(p0: [[21.0], [22.0], [23.0]], p1: [[24.0]]))
    let v2: s0 = s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0]])
    let v3: s0 = s0(p0: [[29.0], [30.0], [31.0]], p1: [[32.0]])
    let v4: Double = 33.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 33.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
