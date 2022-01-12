  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [s0]
  }
  struct s2 {
    var p0: s0
    var p1: [s0]
  }
  struct s8 {
    var p0: [s1]
    var p1: [s2]
  }
  @inline(never)
  func f0(_ v0: s8, _ v1: Double) -> Double {
    var v4: Double = v1
    var v6: Double = v4
    var v3: Double = v4
    v6 = v3
    var v25: Double = v3
    var v31: Double = v3
    v31 = v25
    let v23: Double = v25 * v31
    v25 = v4
    v3 = v4
    let v35: [Double] = [v25, v25, v6, v31]
    let v55: Double = v35[3]
    let v38: Double = v55 - v25
    v6 = v23
    return v38
  }
  func benchmark() {
    let v0: s8 = s8(p0: [s1(p0: [[s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]])]], p1: [s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]])])], p1: [s2(p0: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]]), p1: [s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]])]), s2(p0: s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]]), p1: [s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0], [35.0]])])])
    let v1: Double = 36.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 36.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
