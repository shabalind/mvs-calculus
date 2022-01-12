  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: [[s1]]
  }
  struct s3 {
    var p0: s1
    var p1: Double
  }
  struct s4 {
    var p0: s2
    var p1: s0
  }
  struct s5 {
    var p0: s1
    var p1: [[s2]]
  }
  struct s6 {
    var p0: s4
    var p1: [s2]
  }
  struct s8 {
    var p0: s6
    var p1: s5
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: s8, _ v2: s2, _ v3: Double) -> Double {
    let v11: [[s1]] = v2.p1
    let v14: [s1] = v11[1]
    let v30: s1 = v14[0]
    let v13: s0 = v30.p0
    let v62: [[Double]] = v13.p0
    let v49: [Double] = v62[0]
    let v126: [Double] = v62[0]
    let v93: Double = v126[0]
    var v68: [Double] = v49
    v68[0] = v93
    let v106: Double = v68[0]
    return v106
  }
  func benchmark() {
    let v0: s3 = s3(p0: s1(p0: s0(p0: [[0.0]]), p1: s0(p0: [[1.0]])), p1: 2.0)
    let v1: s8 = s8(p0: s6(p0: s4(p0: s2(p0: s1(p0: s0(p0: [[3.0]]), p1: s0(p0: [[4.0]])), p1: [[s1(p0: s0(p0: [[5.0]]), p1: s0(p0: [[6.0]]))], [s1(p0: s0(p0: [[7.0]]), p1: s0(p0: [[8.0]]))]]), p1: s0(p0: [[9.0]])), p1: [s2(p0: s1(p0: s0(p0: [[10.0]]), p1: s0(p0: [[11.0]])), p1: [[s1(p0: s0(p0: [[12.0]]), p1: s0(p0: [[13.0]]))], [s1(p0: s0(p0: [[14.0]]), p1: s0(p0: [[15.0]]))]]), s2(p0: s1(p0: s0(p0: [[16.0]]), p1: s0(p0: [[17.0]])), p1: [[s1(p0: s0(p0: [[18.0]]), p1: s0(p0: [[19.0]]))], [s1(p0: s0(p0: [[20.0]]), p1: s0(p0: [[21.0]]))]]), s2(p0: s1(p0: s0(p0: [[22.0]]), p1: s0(p0: [[23.0]])), p1: [[s1(p0: s0(p0: [[24.0]]), p1: s0(p0: [[25.0]]))], [s1(p0: s0(p0: [[26.0]]), p1: s0(p0: [[27.0]]))]])]), p1: s5(p0: s1(p0: s0(p0: [[28.0]]), p1: s0(p0: [[29.0]])), p1: [[s2(p0: s1(p0: s0(p0: [[30.0]]), p1: s0(p0: [[31.0]])), p1: [[s1(p0: s0(p0: [[32.0]]), p1: s0(p0: [[33.0]]))], [s1(p0: s0(p0: [[34.0]]), p1: s0(p0: [[35.0]]))]])], [s2(p0: s1(p0: s0(p0: [[36.0]]), p1: s0(p0: [[37.0]])), p1: [[s1(p0: s0(p0: [[38.0]]), p1: s0(p0: [[39.0]]))], [s1(p0: s0(p0: [[40.0]]), p1: s0(p0: [[41.0]]))]])]]))
    let v2: s2 = s2(p0: s1(p0: s0(p0: [[42.0]]), p1: s0(p0: [[43.0]])), p1: [[s1(p0: s0(p0: [[44.0]]), p1: s0(p0: [[45.0]]))], [s1(p0: s0(p0: [[46.0]]), p1: s0(p0: [[47.0]]))]])
    let v3: Double = 48.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 48.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
