  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: [s0], _ v2: Double) -> Double {
    let v6: s0 = v1[0]
    let v3: [[Double]] = v6.p1
    let v9: [Double] = v3[0]
    let v11: Double = v2 - v2
    let v47: Double = v9[0]
    let v30: [Double] = v3[0]
    let v70: Double = v30[0]
    var v68: Double = v47
    let v96: [Double] = [v70, v11, v47, v47, v11, v47, v68]
    let v133: Double = v96[6]
    return v133
  }
  func benchmark() {
    let v0: s1 = s1(p0: [[s0(p0: [[0.0]], p1: [[1.0]])], [s0(p0: [[2.0]], p1: [[3.0]])], [s0(p0: [[4.0]], p1: [[5.0]])]], p1: s0(p0: [[6.0]], p1: [[7.0]]))
    let v1: [s0] = [s0(p0: [[8.0]], p1: [[9.0]]), s0(p0: [[10.0]], p1: [[11.0]])]
    let v2: Double = 12.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 12.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
