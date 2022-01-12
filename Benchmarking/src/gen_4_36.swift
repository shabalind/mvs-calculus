  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: Double
  }
  struct s2 {
    var p0: [[s0]]
    var p1: Double
  }
  struct s9 {
    var p0: [s1]
    var p1: s2
  }
  @inline(never)
  func f0(_ v0: s9, _ v1: Double) -> Double {
    let v7: [s1] = v0.p0
    let v24: s1 = v7[0]
    let v91: [[s0]] = v24.p0
    let v84: [s0] = v91[0]
    let v104: s0 = v84[0]
    let v49: [[Double]] = v104.p1
    let v97: [Double] = v49[1]
    let v307: Double = v97[0]
    var v122: Double = v307
    let v127: Double = v122 + v1
    return v127
  }
  func benchmark() {
    let v0: s9 = s9(p0: [s1(p0: [[s0(p0: [[0.0]], p1: [[1.0], [2.0]])]], p1: 3.0)], p1: s2(p0: [[s0(p0: [[4.0]], p1: [[5.0], [6.0]])], [s0(p0: [[7.0]], p1: [[8.0], [9.0]])]], p1: 10.0))
    let v1: Double = 11.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 11.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
