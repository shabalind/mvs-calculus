  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: Double
    var p3: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: s1, _ v2: Double) -> Double {
    let v8: [s0] = v1.p0
    let v6: s0 = v8[0]
    var v26: Double = v2
    let v31: [[Double]] = v6.p1
    let v41: [Double] = v31[1]
    let v25: Double = v41[0]
    let v90: Double = v26 / v26
    let v83: Double = v90 * v90
    let v177: Double = v83 + v25
    var v398: Double = v177
    return v398
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]], p2: 5.0, p3: [[6.0], [7.0], [8.0]])]
    let v1: s1 = s1(p0: [s0(p0: [[9.0], [10.0], [11.0]], p1: [[12.0], [13.0]], p2: 14.0, p3: [[15.0], [16.0], [17.0]]), s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0]], p2: 23.0, p3: [[24.0], [25.0], [26.0]])], p1: s0(p0: [[27.0], [28.0], [29.0]], p1: [[30.0], [31.0]], p2: 32.0, p3: [[33.0], [34.0], [35.0]]))
    let v2: Double = 36.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 36.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
