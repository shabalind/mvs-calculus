  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  struct s2 {
    var p0: s0
    var p1: [Double]
  }
  struct s3 {
    var p0: s1
    var p1: [s2]
  }
  func f1(_ v0: s0) -> s0 {
    let v5: [[Double]] = v0.p0
    let v6: s0 = s0(p0: v5, p1: v5)
    var v3: s0 = v0
    let v2: [[Double]] = v0.p0
    let v1: [[Double]] = v0.p1
    let v9: [[Double]] = v0.p0
    let v14: [[Double]] = v3.p1
    let v30: s0 = s0(p0: v9, p1: v5)
    v3.p1 = v1
    v3.p1 = v1
    var v29: s0 = v3
    let v21: [[Double]] = v30.p0
    let v26: [[Double]] = v29.p0
    v3.p0 = v2
    let v24: [[Double]] = v0.p0
    let v39: s0 = s0(p0: v24, p1: v26)
    let v18: [[Double]] = v0.p1
    v3 = v0
    let v42: [[Double]] = v0.p1
    var v38: s0 = v39
    let v70: [[Double]] = v39.p0
    v38.p1 = v14
    var v46: s0 = v30
    v46.p1 = v5
    let v31: [[Double]] = v29.p1
    v3.p1 = v26
    v38.p1 = v18
    v3.p0 = v26
    v3.p0 = v2
    v38.p0 = v18
    let v64: s0 = s0(p0: v42, p1: v21)
    v46 = v64
    v46.p1 = v2
    let v119: [[Double]] = v46.p0
    var v173: s0 = v64
    let v91: [[Double]] = v46.p1
    let v114: [[Double]] = v6.p1
    v173 = v38
    v38.p1 = v119
    v38.p0 = v91
    v173 = v0
    v29.p1 = v70
    v38.p0 = v31
    v46.p1 = v119
    v173.p0 = v114
    let v177: [[Double]] = v173.p0
    v3.p1 = v177
    return v173
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    let v5: s1 = v0.p0
    let v3: s0 = v5.p1
    let v6: s0 = f1(v3)
    var v2: Double = v1
    let v4: [[Double]] = v6.p1
    let v9: [Double] = v4[0]
    var v11: [Double] = v9
    v11[0] = v1
    let v17: Double = v11[0]
    v11[0] = v17
    v11[0] = v1
    let v33: [Double] = [v2, v2, v2, v2, v17]
    v11[0] = v1
    let v20: Double = v33[4]
    v11[0] = v20
    v11[0] = v17
    return v20
  }
  func benchmark() {
    let v0: s3 = s3(p0: s1(p0: [[s0(p0: [[0.0]], p1: [[1.0]])], [s0(p0: [[2.0]], p1: [[3.0]])], [s0(p0: [[4.0]], p1: [[5.0]])]], p1: s0(p0: [[6.0]], p1: [[7.0]])), p1: [s2(p0: s0(p0: [[8.0]], p1: [[9.0]]), p1: [10.0, 11.0]), s2(p0: s0(p0: [[12.0]], p1: [[13.0]]), p1: [14.0, 15.0])])
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
