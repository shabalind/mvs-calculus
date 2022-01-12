  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [s0]
  }
  struct s2 {
    var p0: [s1]
    var p1: s0
  }
  struct s3 {
    var p0: [s2]
    var p1: s0
  }
  struct s4 {
    var p0: [s1]
    var p1: s0
  }
  struct s9 {
    var p0: s4
    var p1: s3
  }
  @inline(never)
  func f0(_ v0: s9, _ v1: [s1], _ v2: Double) -> Double {
    var v13: Double = v2
    let v14: s3 = v0.p1
    let v11: s0 = v14.p1
    let v35: [[Double]] = v11.p0
    let v50: [Double] = v35[0]
    var v51: [Double] = v50
    let v52: Double = v51[0]
    let v62: Double = v50[0]
    let v39: [Double] = [v52, v2, v52, v13, v62, v2, v13]
    let v49: Double = v39[0]
    let v161: Double = v50[0]
    v51[0] = v161
    v51[0] = v49
    return v49
  }
  func benchmark() {
    let v0: s9 = s9(p0: s4(p0: [s1(p0: [[s0(p0: [[0.0]])]], p1: [s0(p0: [[1.0]])]), s1(p0: [[s0(p0: [[2.0]])]], p1: [s0(p0: [[3.0]])])], p1: s0(p0: [[4.0]])), p1: s3(p0: [s2(p0: [s1(p0: [[s0(p0: [[5.0]])]], p1: [s0(p0: [[6.0]])]), s1(p0: [[s0(p0: [[7.0]])]], p1: [s0(p0: [[8.0]])]), s1(p0: [[s0(p0: [[9.0]])]], p1: [s0(p0: [[10.0]])])], p1: s0(p0: [[11.0]])), s2(p0: [s1(p0: [[s0(p0: [[12.0]])]], p1: [s0(p0: [[13.0]])]), s1(p0: [[s0(p0: [[14.0]])]], p1: [s0(p0: [[15.0]])]), s1(p0: [[s0(p0: [[16.0]])]], p1: [s0(p0: [[17.0]])])], p1: s0(p0: [[18.0]])), s2(p0: [s1(p0: [[s0(p0: [[19.0]])]], p1: [s0(p0: [[20.0]])]), s1(p0: [[s0(p0: [[21.0]])]], p1: [s0(p0: [[22.0]])]), s1(p0: [[s0(p0: [[23.0]])]], p1: [s0(p0: [[24.0]])])], p1: s0(p0: [[25.0]]))], p1: s0(p0: [[26.0]])))
    let v1: [s1] = [s1(p0: [[s0(p0: [[27.0]])]], p1: [s0(p0: [[28.0]])])]
    let v2: Double = 29.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 29.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
