  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: [[s0]]
    var p1: [s0]
  }
  func f21(_ v0: Double) -> Double {
    var v1: Double = v0
    v1 = v0
    var v2: Double = v1
    var v5: Double = v0
    var v3: Double = v1
    var v6: Double = v0
    var v7: Double = v3
    var v11: Double = v5
    var v9: Double = v3
    var v15: Double = v7
    var v14: Double = v11
    v7 = v5
    v6 = v11
    var v23: Double = v15
    v5 = v1
    var v18: Double = v6
    var v25: Double = v15
    var v17: Double = v2
    let v16: [Double] = [v3]
    var v34: Double = v17
    var v35: [Double] = v16
    var v55: Double = v23
    let v32: Double = v16[0]
    let v59: Double = v35[0]
    v35[0] = v59
    var v26: Double = v9
    var v27: [Double] = v35
    v27[0] = v3
    let v69: Double = v16[0]
    var v31: [Double] = v27
    var v38: Double = v26
    v35[0] = v38
    var v29: Double = v0
    v27[0] = v34
    v27[0] = v0
    v35 = v31
    var v70: [Double] = v35
    var v42: [Double] = v31
    let v76: Double = v35[0]
    v42[0] = v3
    v34 = v76
    var v43: [Double] = v70
    let v78: Double = v42[0]
    var v92: Double = v6
    v3 = v9
    v43[0] = v29
    v31[0] = v69
    let v50: Double = v43[0]
    let v37: [Double] = [v14, v92, v17, v32, v25, v55]
    v25 = v78
    v70[0] = v50
    v3 = v7
    var v108: [Double] = v37
    var v106: Double = v50
    v108[2] = v18
    v35[0] = v106
    var v117: [Double] = v108
    let v77: Double = v117[5]
    v43[0] = v38
    return v77
  }
  @inline(never)
  func f0(_ v0: [[s2]], _ v1: Double) -> Double {
    var v20: Double = v1
    let v17: Double = f21(v20)
    var v49: Double = v17
    return v49
  }
  func benchmark() {
    let v0: [[s2]] = [[s2(p0: [[s0(p0: [[0.0]], p1: [[1.0]])], [s0(p0: [[2.0]], p1: [[3.0]])]], p1: [s0(p0: [[4.0]], p1: [[5.0]]), s0(p0: [[6.0]], p1: [[7.0]]), s0(p0: [[8.0]], p1: [[9.0]])])]]
    let v1: Double = 10.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 10.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
