  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: Double
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: s0
    var p1: s1
  }
  struct s4 {
    var p0: s0
    var p1: s0
    var p2: [[s2]]
  }
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: s4, _ v2: Double) -> Double {
    var v7: Double = v2
    let v10: s0 = v1.p1
    let v19: Double = v2 / v2
    let v17: [[Double]] = v10.p0
    let v18: Double = v10.p1
    let v20: Double = v18 / v2
    let v28: s0 = s0(p0: v17, p1: v19)
    let v37: [[Double]] = v28.p0
    let v34: s0 = s0(p0: v37, p1: v19)
    let v45: Double = v20 / v19
    let v103: Double = v34.p1
    var v82: Double = v103
    let v99: Double = v18 - v7
    let v109: Double = v45 + v82
    let v137: Double = v99 * v109
    return v137
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0]]
    let v1: s4 = s4(p0: s0(p0: [[1.0], [2.0], [3.0]], p1: 4.0), p1: s0(p0: [[5.0], [6.0], [7.0]], p1: 8.0), p2: [[s2(p0: s0(p0: [[9.0], [10.0], [11.0]], p1: 12.0), p1: s1(p0: s0(p0: [[13.0], [14.0], [15.0]], p1: 16.0), p1: s0(p0: [[17.0], [18.0], [19.0]], p1: 20.0)))], [s2(p0: s0(p0: [[21.0], [22.0], [23.0]], p1: 24.0), p1: s1(p0: s0(p0: [[25.0], [26.0], [27.0]], p1: 28.0), p1: s0(p0: [[29.0], [30.0], [31.0]], p1: 32.0)))]])
    let v2: Double = 33.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 33.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
