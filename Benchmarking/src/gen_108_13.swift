  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [s1]
    var p1: [s0]
  }
  func f78(_ v0: Double) -> Double {
    var v4: Double = v0
    v4 = v0
    var v6: Double = v0
    var v1: Double = v4
    var v8: Double = v6
    v4 = v0
    let v5: Double = v8 * v6
    v1 = v4
    var v2: Double = v1
    var v3: Double = v4
    var v15: Double = v0
    var v12: Double = v0
    let v32: [Double] = [v6, v12]
    let v14: Double = v32[0]
    var v18: [Double] = v32
    let v11: Double = v18[0]
    let v13: Double = v18[0]
    var v20: [Double] = v18
    let v30: Double = v20[0]
    v20[1] = v13
    var v16: Double = v5
    v18[0] = v30
    var v28: [Double] = v32
    v28[0] = v30
    let v27: Double = v18[0]
    v4 = v27
    let v26: [Double] = [v5, v1, v2, v16, v4, v14, v8]
    v18[0] = v14
    var v36: [Double] = v18
    v18[1] = v14
    var v42: [Double] = v26
    v42[2] = v2
    let v35: Double = v26[2]
    var v51: [Double] = v42
    v42[3] = v1
    let v65: Double = v42[4]
    let v31: Double = v36[0]
    let v43: [[Double]] = [v28, v20, v32]
    v18[1] = v1
    var v59: [Double] = v51
    let v50: [Double] = v43[2]
    v42[2] = v31
    var v33: [Double] = v36
    var v94: [[Double]] = v43
    v15 = v35
    var v99: [[Double]] = v43
    let v45: [Double] = v94[0]
    var v39: [Double] = v18
    v59[6] = v5
    var v103: [[Double]] = v99
    v99 = v103
    v51[0] = v30
    v103[2] = v18
    v59[1] = v3
    var v130: [Double] = v50
    v130[1] = v1
    let v56: Double = v45[0]
    let v104: [Double] = v103[2]
    v51[0] = v56
    v94[0] = v104
    var v86: [Double] = v59
    v42[6] = v30
    v103[0] = v45
    v28[1] = v11
    var v126: [Double] = v36
    v99[0] = v32
    v86[0] = v65
    let v174: Double = v86[0]
    v28 = v126
    v18 = v130
    v103 = v43
    v18[1] = v15
    v94[2] = v33
    v103[1] = v39
    return v174
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: Double) -> Double {
    var v29: Double = v1
    let v27: Double = f78(v29)
    let v33: Double = f78(v27)
    var v43: Double = v33
    return v43
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: [s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), p1: s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]]))], p1: [s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]])])]
    let v1: Double = 15.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 15.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
