package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.ChartPieSliceBold: ImageVector
    get() {
        if (_ChartPieSliceBold != null) {
            return _ChartPieSliceBold!!
        }
        _ChartPieSliceBold = ImageVector.Builder(
            name = "Bold.ChartPieSliceBold",
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
                moveTo(32.42f, 137f)
                quadToRelative(-0.42f, -4.44f, -0.42f, -9f)
                arcTo(95.93f, 95.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 40.74f)
                verticalLineToRelative(65.41f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 128.42f)
                verticalLineTo(32f)
                arcTo(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 45.22f, 176.64f)
                close()
            }
        }.build()

        return _ChartPieSliceBold!!
    }

@Suppress("ObjectPropertyName")
private var _ChartPieSliceBold: ImageVector? = null
