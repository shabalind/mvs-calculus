  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  func f38(_ v0: [Double]) -> [Double] {
    let v3: Double = v0[0]
    let v7: Double = v0[0]
    let v2: Double = v0[0]
    let v6: Double = v0[0]
    var v1: [Double] = v0
    var v4: [Double] = v1
    var v11: [Double] = v1
    var v14: Double = v7
    let v16: Double = v1[0]
    v4[0] = v6
    let v12: Double = v11[0]
    var v23: [Double] = v1
    var v13: [Double] = v11
    let v21: Double = v11[0]
    v23[0] = v3
    v4[0] = v12
    let v19: Double = v1[0]
    var v22: [Double] = v1
    var v49: [Double] = v1
    v22[0] = v3
    let v18: Double = v13[0]
    let v32: Double = v23[0]
    var v27: [Double] = v4
    v23[0] = v19
    var v47: Double = v16
    var v79: Double = v2
    let v51: Double = v1[0]
    var v30: Double = v18
    v22[0] = v32
    var v61: [Double] = v13
    let v52: [[Double]] = [v27]
    var v123: [[Double]] = v52
    v49[0] = v30
    var v40: Double = v51
    var v72: [[Double]] = v123
    v123[0] = v23
    let v77: [Double] = v72[0]
    let v121: [Double] = v123[0]
    v49[0] = v30
    let v156: [[Double]] = [v77, v22, v49, v4, v121, v61]
    v27[0] = v47
    v61[0] = v14
    var v229: [[Double]] = v156
    v61[0] = v21
    let v111: [Double] = v229[0]
    v49[0] = v79
    v229[1] = v111
    v13[0] = v40
    return v111
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: Double) -> Double {
    let v3: [[s0]] = [v0, v0, v0]
    let v7: [s0] = v3[0]
    let v8: s0 = v7[1]
    let v5: [[Double]] = v8.p1
    let v17: [Double] = v5[0]
    var v13: [Double] = v17
    let v20: [Double] = v5[0]
    let v18: [Double] = f38(v13)
    let v41: [Double] = f38(v20)
    let v30: [Double] = f38(v41)
    let v56: [Double] = f38(v30)
    v13 = v56
    let v59: [Double] = f38(v18)
    let v43: [Double] = f38(v13)
    let v89: [Double] = f38(v43)
    let v132: Double = v59[0]
    let v104: Double = v132 - v1
    var v103: Double = v104
    v13 = v89
    return v103
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]], p2: [[5.0], [6.0], [7.0]]), s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0], [12.0]], p2: [[13.0], [14.0], [15.0]])]
    let v1: Double = 16.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 16.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
