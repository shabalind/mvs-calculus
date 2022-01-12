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
    var p0: [[s0]]
    var p1: s0
  }
  struct s5 {
    var p0: s1
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: [s5], _ v1: s2, _ v2: Double) -> Double {
    let v9: [[s0]] = v1.p0
    let v25: [s0] = v9[0]
    let v35: s0 = v25[0]
    let v63: [[Double]] = v35.p0
    let v62: [Double] = v63[1]
    var v138: [Double] = v62
    let v89: Double = v138[0]
    var v135: [Double] = v62
    let v173: Double = v135[0]
    let v457: Double = v89 / v173
    return v457
  }
  func benchmark() {
    let v0: [s5] = [s5(p0: s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0]]), p1: [[s0(p0: [[3.0], [4.0]], p1: [[5.0]])]]), p1: [s0(p0: [[6.0], [7.0]], p1: [[8.0]]), s0(p0: [[9.0], [10.0]], p1: [[11.0]])])]
    let v1: s2 = s2(p0: [[s0(p0: [[12.0], [13.0]], p1: [[14.0]])]], p1: s0(p0: [[15.0], [16.0]], p1: [[17.0]]))
    let v2: Double = 18.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 18.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
