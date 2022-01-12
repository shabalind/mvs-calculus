  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s4 {
    var p0: [s0]
    var p1: s1
  }
  struct s5 {
    var p0: s0
    var p1: [s1]
  }
  struct s6 {
    var p0: [s4]
    var p1: [s0]
  }
  struct s9 {
    var p0: s6
    var p1: s0
  }
  struct s10 {
    var p0: s9
    var p1: s5
  }
  @inline(never)
  func f0(_ v0: [[s10]], _ v1: s6, _ v2: Double) -> Double {
    var v9: Double = v2
    let v8: [s0] = v1.p1
    let v14: s0 = v8[0]
    let v18: [[Double]] = v14.p1
    let v93: [Double] = v18[0]
    let v64: [Double] = v18[0]
    let v66: Double = v93[0]
    let v96: Double = v64[0]
    var v82: [Double] = v93
    v82[0] = v66
    v82[0] = v96
    let v98: Double = v82[0]
    v82[0] = v9
    return v98
  }
  func benchmark() {
    let v0: [[s10]] = [[s10(p0: s9(p0: s6(p0: [s4(p0: [s0(p0: [[0.0]], p1: [[1.0]]), s0(p0: [[2.0]], p1: [[3.0]])], p1: s1(p0: s0(p0: [[4.0]], p1: [[5.0]]), p1: s0(p0: [[6.0]], p1: [[7.0]])))], p1: [s0(p0: [[8.0]], p1: [[9.0]])]), p1: s0(p0: [[10.0]], p1: [[11.0]])), p1: s5(p0: s0(p0: [[12.0]], p1: [[13.0]]), p1: [s1(p0: s0(p0: [[14.0]], p1: [[15.0]]), p1: s0(p0: [[16.0]], p1: [[17.0]])), s1(p0: s0(p0: [[18.0]], p1: [[19.0]]), p1: s0(p0: [[20.0]], p1: [[21.0]]))]))]]
    let v1: s6 = s6(p0: [s4(p0: [s0(p0: [[22.0]], p1: [[23.0]]), s0(p0: [[24.0]], p1: [[25.0]])], p1: s1(p0: s0(p0: [[26.0]], p1: [[27.0]]), p1: s0(p0: [[28.0]], p1: [[29.0]])))], p1: [s0(p0: [[30.0]], p1: [[31.0]])])
    let v2: Double = 32.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 32.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
