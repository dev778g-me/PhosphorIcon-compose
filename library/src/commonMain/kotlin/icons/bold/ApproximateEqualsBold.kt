package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.ApproximateEqualsBold: ImageVector
    get() {
        if (_ApproximateEqualsBold != null) {
            return _ApproximateEqualsBold!!
        }
        _ApproximateEqualsBold = ImageVector.Builder(
            name = "Bold.ApproximateEqualsBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 161.61f)
                curveToRelative(72f, -59.69f, 104f, 56.47f, 176f, -3.22f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 97.61f)
                curveToRelative(72f, -59.69f, 104f, 56.47f, 176f, -3.22f)
            }
        }.build()

        return _ApproximateEqualsBold!!
    }

@Suppress("ObjectPropertyName")
private var _ApproximateEqualsBold: ImageVector? = null
