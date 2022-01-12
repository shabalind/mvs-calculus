  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  func f31(_ v0: s0) -> s0 {
    let v7: [[Double]] = v0.p0
    let v4: [Double] = v7[1]
    var v8: s0 = v0
    v8 = v0
    var v15: [[Double]] = v7
    v15[1] = v4
    v8.p0 = v7
    v8.p0 = v15
    let v24: [[Double]] = v0.p1
    v8.p0 = v15
    let v29: [[Double]] = v0.p0
    let v31: [[Double]] = v0.p1
    let v65: [[Double]] = v0.p1
    var v46: [[Double]] = v7
    v8.p1 = v24
    v8.p0 = v7
    v8.p0 = v46
    v8.p0 = v29
    v8.p0 = v15
    let v56: [Double] = v31[0]
    v15[1] = v56
    v8.p1 = v65
    var v36: s0 = v8
    return v36
  }
  func f23(_ v0: s1) -> s1 {
    let v5: [s1] = [v0, v0]
    let v32: s1 = v5[0]
    return v32
  }
  @inline(never)
  func f0(_ v0: [[s1]], _ v1: Double) -> Double {
    var v6: [[s1]] = v0
    var v4: [[s1]] = v0
    var v9: Double = v1
    var v7: Double = v9
    let v3: [s1] = v6[2]
    let v8: s1 = v3[0]
    v4[0] = v3
    let v2: s1 = f23(v8)
    let v5: s0 = v2.p0
    v7 = v1
    let v14: s1 = f23(v2)
    let v18: [s1] = v0[1]
    var v16: [[s1]] = v0
    let v10: s0 = v14.p0
    let v12: [s1] = v0[2]
    v16[0] = v18
    v4[0] = v12
    let v13: Double = v1 * v7
    let v26: [[Double]] = v5.p0
    let v21: s0 = f31(v5)
    let v17: [s1] = v0[0]
    let v55: [[Double]] = v21.p1
    var v25: [[s1]] = v16
    v16 = v25
    let v31: [Double] = v55[0]
    let v27: s1 = f23(v2)
    var v41: [Double] = v31
    v25[1] = v17
    let v32: [Double] = v26[1]
    v6[1] = v3
    var v38: [[Double]] = v55
    var v28: [[Double]] = v55
    let v61: [Double] = v26[0]
    v41 = v32
    let v40: [s1] = v4[1]
    v4[2] = v18
    var v86: s1 = v2
    v28[0] = v32
    let v52: s1 = v12[0]
    let v36: s0 = f31(v10)
    var v59: [[s1]] = v25
    v86.p0 = v36
    v86 = v27
    let v54: s0 = s0(p0: v26, p1: v38)
    v16[1] = v40
    let v76: [Double] = v28[0]
    let v158: Double = v76[0]
    v86.p0 = v54
    var v124: [s1] = v12
    let v53: Double = v158 * v13
    let v133: Double = v61[0]
    v41[0] = v13
    let v119: s0 = v52.p0
    v4[0] = v124
    var v134: [s1] = v18
    v59[0] = v17
    v41[0] = v53
    v6[1] = v17
    let v189: Double = v41[0]
    let v194: s1 = f23(v86)
    v86.p0 = v119
    v41[0] = v133
    let v163: [s1] = v59[0]
    let v82: [s1] = v25[2]
    v124[0] = v14
    v41[0] = v9
    v16[2] = v82
    v6[0] = v163
    v25[1] = v134
    let v465: s1 = f23(v194)
    v134[0] = v465
    return v189
  }
  func benchmark() {
    let v0: [[s1]] = [[s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0]]), p1: s0(p0: [[3.0], [4.0]], p1: [[5.0]]))], [s1(p0: s0(p0: [[6.0], [7.0]], p1: [[8.0]]), p1: s0(p0: [[9.0], [10.0]], p1: [[11.0]]))], [s1(p0: s0(p0: [[12.0], [13.0]], p1: [[14.0]]), p1: s0(p0: [[15.0], [16.0]], p1: [[17.0]]))]]
    let v1: Double = 18.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 18.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
