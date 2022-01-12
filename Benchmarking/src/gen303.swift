  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: Double
    var p1: s0
  }
  struct s3 {
    var p0: [[s2]]
    var p1: s2
  }
  func f100(_ v0: [s2], _ v1: s0) -> s0 {
    let v4: [[Double]] = v1.p1
    let v3: [[Double]] = v1.p0
    var v7: [s2] = v0
    let v2: [Double] = v3[0]
    var v5: [Double] = v2
    let v11: [[Double]] = v1.p1
    let v6: s2 = v7[0]
    let v9: [[Double]] = v1.p0
    v7[0] = v6
    let v18: s0 = v6.p1
    var v59: s0 = v18
    var v15: [Double] = v5
    var v49: s2 = v6
    let v32: Double = v15[0]
    v5[0] = v32
    var v35: [[Double]] = v4
    let v30: s0 = v49.p1
    v59.p0 = v9
    v59.p1 = v11
    v49.p1 = v59
    v49.p0 = v32
    v7[0] = v49
    var v21: s0 = v30
    v21.p1 = v35
    v49.p0 = v32
    v35[1] = v15
    return v21
  }
  func f87(_ v0: [s2]) -> [s2] {
    let v4: [[s2]] = [v0]
    let v7: s2 = v0[0]
    var v3: [s2] = v0
    let v1: [s2] = v4[0]
    var v8: s2 = v7
    let v2: s0 = v8.p1
    var v10: s0 = v2
    let v19: [s2] = v4[0]
    let v5: s0 = f100(v1, v10)
    let v14: s2 = v19[0]
    var v24: [s2] = v3
    let v12: s0 = f100(v19, v10)
    let v26: s2 = v1[0]
    let v30: [s2] = [v14, v7, v8, v8, v26]
    v8.p1 = v12
    let v20: [[Double]] = v12.p0
    let v21: s0 = f100(v24, v5)
    let v45: s0 = f100(v24, v10)
    v8.p1 = v21
    let v41: Double = v7.p0
    let v46: s2 = v30[2]
    v10.p0 = v20
    v8.p1 = v10
    v3[0] = v7
    var v198: [s2] = v0
    v198[0] = v46
    v8.p1 = v45
    v8.p0 = v41
    return v198
  }
  func f73(_ v0: s0) -> s0 {
    var v3: s0 = v0
    let v5: [[Double]] = v3.p0
    let v7: [Double] = v5[0]
    let v2: Double = v7[0]
    let v13: [Double] = v5[0]
    v3.p0 = v5
    v3.p0 = v5
    v3.p0 = v5
    var v14: [[Double]] = v5
    v14[0] = v13
    let v4: [Double] = v14[0]
    var v8: [[Double]] = v5
    let v9: [[Double]] = v3.p1
    v14[0] = v7
    let v23: [[Double]] = v0.p1
    var v19: [[Double]] = v23
    let v11: [Double] = v14[0]
    let v34: [[Double]] = v3.p0
    v3.p1 = v9
    let v20: [[Double]] = v0.p1
    let v15: [[Double]] = v0.p1
    v14[0] = v4
    let v26: [[Double]] = v3.p1
    let v31: [Double] = v14[0]
    v3.p0 = v34
    v3.p1 = v19
    v3.p0 = v5
    var v28: [[Double]] = v20
    var v27: [Double] = v13
    v3 = v0
    var v64: s0 = v0
    var v37: [[Double]] = v5
    let v38: [Double] = v37[0]
    v19[1] = v38
    var v41: s0 = v64
    v3.p1 = v28
    v3.p0 = v14
    v14[0] = v31
    v64.p1 = v15
    var v40: [Double] = v27
    var v110: [[Double]] = v14
    v37[0] = v11
    v64.p1 = v26
    let v33: [[Double]] = v0.p0
    let v103: [Double] = v19[1]
    var v52: [Double] = v13
    v19[1] = v52
    let v50: [Double] = v110[0]
    v64.p0 = v8
    v41.p1 = v9
    v28[0] = v50
    v37[0] = v40
    v14 = v33
    v28[1] = v40
    v19[1] = v103
    v40[0] = v2
    let v53: [[Double]] = v3.p1
    v64.p1 = v53
    v64.p1 = v20
    v19[1] = v7
    return v41
  }
  func f32(_ v0: Double) -> Double {
    var v2: Double = v0
    let v6: [Double] = [v2, v0, v0, v0, v2, v0, v0]
    let v7: Double = v6[4]
    var v8: [Double] = v6
    v8[0] = v7
    let v11: Double = v6[5]
    var v9: Double = v2
    let v10: Double = v6[2]
    let v1: Double = v8[2]
    v8[4] = v9
    v8[1] = v10
    v8[0] = v11
    v8[2] = v2
    v8[5] = v11
    v8[5] = v0
    v8[2] = v1
    var v86: [Double] = v8
    let v19: Double = v86[3]
    return v19
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    let v4: [[s2]] = v0.p0
    let v6: [s2] = v4[0]
    let v3: s2 = v0.p1
    let v11: Double = f32(v1)
    let v7: s2 = v0.p1
    let v8: Double = v1 + v11
    let v10: Double = f32(v8)
    let v16: [s2] = f87(v6)
    let v12: s2 = v0.p1
    let v19: s0 = v3.p1
    let v22: s0 = v7.p1
    let v24: s2 = v16[0]
    var v34: s2 = v12
    var v69: s2 = v34
    let v44: Double = v69.p0
    v69.p1 = v22
    v69.p0 = v10
    let v54: s0 = f73(v19)
    v69 = v24
    v34.p1 = v22
    let v97: s0 = v3.p1
    v34.p1 = v97
    v69.p1 = v54
    return v44
  }
  func benchmark() {
    let v0: s3 = s3(p0: [[s2(p0: 0.0, p1: s0(p0: [[1.0]], p1: [[2.0], [3.0]]))]], p1: s2(p0: 4.0, p1: s0(p0: [[5.0]], p1: [[6.0], [7.0]])))
    let v1: Double = 8.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 8.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
