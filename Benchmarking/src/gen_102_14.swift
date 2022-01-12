  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  struct s2 {
    var p0: s0
    var p1: s0
    var p2: [s0]
  }
  struct s3 {
    var p0: s2
    var p1: s1
  }
  struct s5 {
    var p0: [s3]
    var p1: s1
  }
  struct s8 {
    var p0: s2
    var p1: [s5]
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: s3, _ v2: s0, _ v3: s8, _ v4: Double) -> Double {
    let v6: [[Double]] = v0.p1
    var v9: [[Double]] = v6
    let v15: [Double] = v9[0]
    let v18: [Double] = v9[0]
    let v14: [[Double]] = v0.p0
    v9[0] = v18
    v9[0] = v18
    let v32: [[Double]] = v2.p1
    let v37: [Double] = v32[0]
    v9[0] = v15
    let v46: [[Double]] = [v15, v37, v15]
    let v55: [Double] = v46[2]
    v9[0] = v37
    let v134: [Double] = v46[0]
    var v65: [[Double]] = v46
    let v87: [Double] = v65[0]
    v65[1] = v15
    v65[2] = v134
    v9[0] = v55
    v65[2] = v18
    v65[2] = v87
    let v88: Double = v18[0]
    v65[2] = v87
    var v97: Double = v88
    let v180: [Double] = v14[0]
    let v234: [Double] = v65[2]
    v9[0] = v234
    v65[2] = v180
    return v97
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0]], p1: [[1.0]])
    let v1: s3 = s3(p0: s2(p0: s0(p0: [[2.0]], p1: [[3.0]]), p1: s0(p0: [[4.0]], p1: [[5.0]]), p2: [s0(p0: [[6.0]], p1: [[7.0]])]), p1: s1(p0: s0(p0: [[8.0]], p1: [[9.0]]), p1: [[s0(p0: [[10.0]], p1: [[11.0]])]]))
    let v2: s0 = s0(p0: [[12.0]], p1: [[13.0]])
    let v3: s8 = s8(p0: s2(p0: s0(p0: [[14.0]], p1: [[15.0]]), p1: s0(p0: [[16.0]], p1: [[17.0]]), p2: [s0(p0: [[18.0]], p1: [[19.0]])]), p1: [s5(p0: [s3(p0: s2(p0: s0(p0: [[20.0]], p1: [[21.0]]), p1: s0(p0: [[22.0]], p1: [[23.0]]), p2: [s0(p0: [[24.0]], p1: [[25.0]])]), p1: s1(p0: s0(p0: [[26.0]], p1: [[27.0]]), p1: [[s0(p0: [[28.0]], p1: [[29.0]])]])), s3(p0: s2(p0: s0(p0: [[30.0]], p1: [[31.0]]), p1: s0(p0: [[32.0]], p1: [[33.0]]), p2: [s0(p0: [[34.0]], p1: [[35.0]])]), p1: s1(p0: s0(p0: [[36.0]], p1: [[37.0]]), p1: [[s0(p0: [[38.0]], p1: [[39.0]])]]))], p1: s1(p0: s0(p0: [[40.0]], p1: [[41.0]]), p1: [[s0(p0: [[42.0]], p1: [[43.0]])]]))])
    let v4: Double = 44.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 44.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
