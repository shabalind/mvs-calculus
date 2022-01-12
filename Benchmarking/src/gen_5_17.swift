  import Dispatch
  struct s0 {
    var p0: Double
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s4 {
    var p0: s0
    var p1: s1
  }
  struct s7 {
    var p0: [s4]
    var p1: s1
  }
  @inline(never)
  func f0(_ v0: s7, _ v1: Double) -> Double {
    var v2: Double = v1
    var v3: s7 = v0
    let v11: s1 = v3.p1
    let v21: Double = v1 * v2
    let v14: s0 = v11.p0
    let v17: [Double] = [v2, v21, v2]
    let v23: Double = v17[0]
    let v37: Double = v17[1]
    let v25: Double = v17[2]
    let v34: Double = v14.p0
    let v60: [[Double]] = v14.p1
    let v58: [Double] = v60[0]
    let v46: Double = v58[0]
    let v63: Double = v17[2]
    v2 = v63
    let v78: [Double] = [v23, v25, v37, v46, v1, v34, v37]
    let v87: Double = v78[4]
    return v87
  }
  func benchmark() {
    let v0: s7 = s7(p0: [s4(p0: s0(p0: 0.0, p1: [[1.0]], p2: [[2.0]]), p1: s1(p0: s0(p0: 3.0, p1: [[4.0]], p2: [[5.0]]), p1: [s0(p0: 6.0, p1: [[7.0]], p2: [[8.0]]), s0(p0: 9.0, p1: [[10.0]], p2: [[11.0]])])), s4(p0: s0(p0: 12.0, p1: [[13.0]], p2: [[14.0]]), p1: s1(p0: s0(p0: 15.0, p1: [[16.0]], p2: [[17.0]]), p1: [s0(p0: 18.0, p1: [[19.0]], p2: [[20.0]]), s0(p0: 21.0, p1: [[22.0]], p2: [[23.0]])]))], p1: s1(p0: s0(p0: 24.0, p1: [[25.0]], p2: [[26.0]]), p1: [s0(p0: 27.0, p1: [[28.0]], p2: [[29.0]]), s0(p0: 30.0, p1: [[31.0]], p2: [[32.0]])]))
    let v1: Double = 33.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 33.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
