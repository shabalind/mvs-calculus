  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s3 {
    var p0: s0
  }
  struct s4 {
    var p0: s0
    var p1: [s3]
    var p2: [s0]
  }
  struct s6 {
    var p0: s4
    var p1: [s1]
  }
  func f96(_ v0: s3) -> s3 {
    let v6: s0 = v0.p0
    let v1: s0 = v0.p0
    var v7: s3 = v0
    v7.p0 = v6
    var v3: s3 = v7
    var v10: s0 = v1
    var v25: s0 = v6
    let v18: [[Double]] = v25.p1
    var v14: s3 = v7
    var v19: s0 = v1
    v14.p0 = v10
    v10.p1 = v18
    let v36: s0 = v3.p0
    var v22: s3 = v14
    v25 = v6
    let v58: s0 = v7.p0
    v7.p0 = v36
    v14.p0 = v1
    v3.p0 = v58
    let v50: [[Double]] = v1.p0
    v25.p0 = v50
    v14.p0 = v19
    return v22
  }
  func f20(_ v0: s3, _ v1: s6) -> s3 {
    let v6: s3 = f96(v0)
    let v11: s3 = f96(v6)
    return v11
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: s6, _ v2: Double) -> Double {
    let v7: s3 = f20(v0, v1)
    let v11: s0 = v7.p0
    let v23: [[Double]] = v11.p1
    let v40: Double = v2 / v2
    var v51: Double = v40
    let v47: [Double] = v23[0]
    let v19: Double = v47[0]
    var v37: [Double] = v47
    v37[0] = v40
    var v31: Double = v2
    v37[0] = v40
    v37[0] = v19
    v37[0] = v40
    v37[0] = v51
    v37[0] = v40
    let v140: Double = v37[0]
    v37[0] = v31
    v37[0] = v19
    v37[0] = v140
    return v140
  }
  func benchmark() {
    let v0: s3 = s3(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0]]))
    let v1: s6 = s6(p0: s4(p0: s0(p0: [[3.0], [4.0]], p1: [[5.0]]), p1: [s3(p0: s0(p0: [[6.0], [7.0]], p1: [[8.0]])), s3(p0: s0(p0: [[9.0], [10.0]], p1: [[11.0]]))], p2: [s0(p0: [[12.0], [13.0]], p1: [[14.0]])]), p1: [s1(p0: s0(p0: [[15.0], [16.0]], p1: [[17.0]]), p1: [s0(p0: [[18.0], [19.0]], p1: [[20.0]]), s0(p0: [[21.0], [22.0]], p1: [[23.0]]), s0(p0: [[24.0], [25.0]], p1: [[26.0]])]), s1(p0: s0(p0: [[27.0], [28.0]], p1: [[29.0]]), p1: [s0(p0: [[30.0], [31.0]], p1: [[32.0]]), s0(p0: [[33.0], [34.0]], p1: [[35.0]]), s0(p0: [[36.0], [37.0]], p1: [[38.0]])])])
    let v2: Double = 39.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 39.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
