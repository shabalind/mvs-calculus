  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
  }
  struct s2 {
    var p0: s1
  }
  struct s3 {
    var p0: [s2]
    var p1: s0
  }
  struct s4 {
    var p0: [s3]
    var p1: s1
  }
  struct s6 {
    var p0: [s1]
    var p1: s4
  }
  func f50(_ v0: Double) -> Double {
    var v4: Double = v0
    var v1: Double = v4
    var v5: Double = v1
    var v3: Double = v0
    var v2: Double = v4
    var v6: Double = v1
    v2 = v0
    var v7: Double = v0
    var v8: Double = v7
    var v11: Double = v5
    var v9: Double = v2
    var v15: Double = v6
    var v27: Double = v9
    var v24: Double = v8
    var v21: Double = v24
    var v23: Double = v21
    var v28: Double = v11
    let v22: [Double] = [v11, v5, v7]
    let v36: Double = v22[2]
    var v57: [Double] = v22
    var v40: [Double] = v57
    v40[1] = v0
    var v71: [Double] = v22
    v11 = v28
    var v47: [Double] = v71
    let v37: Double = v57[2]
    let v44: Double = v40[0]
    let v39: Double = v22[2]
    v47[2] = v23
    v40[2] = v39
    v47[1] = v4
    v40[2] = v6
    v47[1] = v28
    v40[2] = v11
    v9 = v15
    v40[1] = v37
    v47[0] = v36
    var v50: [Double] = v47
    var v76: [Double] = v40
    v50[2] = v24
    v47[0] = v5
    var v35: Double = v5
    let v46: Double = v40[0]
    let v110: Double = v47[2]
    var v42: Double = v1
    v50[2] = v44
    var v156: [Double] = v76
    v71[1] = v3
    v47[2] = v46
    let v81: Double = v50[1]
    v57[1] = v27
    let v88: Double = v156[1]
    var v102: [Double] = v156
    v28 = v88
    v76[2] = v35
    v40[0] = v110
    let v106: Double = v102[1]
    var v176: Double = v81
    v1 = v42
    v24 = v106
    return v176
  }
  func f28(_ v0: Double) -> Double {
    let v1: Double = f50(v0)
    let v5: [Double] = [v1, v1, v1, v0, v1]
    var v6: Double = v0
    let v4: Double = v5[3]
    let v2: [Double] = [v0, v4, v6, v4, v4, v4, v4]
    var v7: Double = v6
    v6 = v7
    let v10: Double = v2[4]
    var v23: [Double] = v2
    let v28: Double = v23[4]
    var v44: [Double] = v2
    let v42: Double = f50(v28)
    let v27: Double = f50(v42)
    v23[5] = v4
    var v38: [Double] = v44
    v38[0] = v27
    v23[0] = v10
    let v91: Double = v38[2]
    return v91
  }
  @inline(never)
  func f0(_ v0: s6, _ v1: Double) -> Double {
    let v5: Double = f50(v1)
    let v3: Double = f28(v5)
    var v9: Double = v3
    let v53: Double = f50(v9)
    return v53
  }
  func benchmark() {
    let v0: s6 = s6(p0: [s1(p0: [[s0(p0: [[0.0]], p1: [[1.0]])]])], p1: s4(p0: [s3(p0: [s2(p0: s1(p0: [[s0(p0: [[2.0]], p1: [[3.0]])]])), s2(p0: s1(p0: [[s0(p0: [[4.0]], p1: [[5.0]])]]))], p1: s0(p0: [[6.0]], p1: [[7.0]])), s3(p0: [s2(p0: s1(p0: [[s0(p0: [[8.0]], p1: [[9.0]])]])), s2(p0: s1(p0: [[s0(p0: [[10.0]], p1: [[11.0]])]]))], p1: s0(p0: [[12.0]], p1: [[13.0]])), s3(p0: [s2(p0: s1(p0: [[s0(p0: [[14.0]], p1: [[15.0]])]])), s2(p0: s1(p0: [[s0(p0: [[16.0]], p1: [[17.0]])]]))], p1: s0(p0: [[18.0]], p1: [[19.0]]))], p1: s1(p0: [[s0(p0: [[20.0]], p1: [[21.0]])]])))
    let v1: Double = 22.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 22.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
