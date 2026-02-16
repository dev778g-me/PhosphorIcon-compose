package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.AirplaneLandingBold: ImageVector
    get() {
        if (_AirplaneLandingBold != null) {
            return _AirplaneLandingBold!!
        }
        _AirplaneLandingBold = ImageVector.Builder(
            name = "Bold.AirplaneLandingBold",
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
                moveTo(104f, 216f)
                lineTo(244f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(232f, 180f)
                lineTo(55.37f, 130.54f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 99.73f)
                verticalLineTo(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.53f, -7.59f)
                lineTo(48f, 42.24f)
                lineTo(60f, 75.46f)
                lineTo(104f, 88f)
                verticalLineTo(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.53f, -7.59f)
                lineTo(120f, 42.24f)
                lineToRelative(24f, 57.2f)
                lineToRelative(64.56f, 18f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 148.32f)
                close()
            }
        }.build()

        return _AirplaneLandingBold!!
    }

@Suppress("ObjectPropertyName")
private var _AirplaneLandingBold: ImageVector? = null
