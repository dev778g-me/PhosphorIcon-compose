package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.BulldozerBold: ImageVector
    get() {
        if (_BulldozerBold != null) {
            return _BulldozerBold!!
        }
        _BulldozerBold = ImageVector.Builder(
            name = "Bold.BulldozerBold",
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
                moveTo(188f, 176f)
                lineTo(220f, 176f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(44f, 144f)
                lineTo(156f, 144f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 188f, 176f)
                lineTo(188f, 176f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 156f, 208f)
                lineTo(44f, 208f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 176f)
                lineTo(12f, 176f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 44f, 144f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 48f)
                lineTo(56f, 144f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(244f, 144f)
                horizontalLineToRelative(-8f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineToRelative(8f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 160.5f)
                verticalLineTo(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineToRelative(86.67f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.38f, 4.92f)
                lineTo(156f, 144f)
            }
        }.build()

        return _BulldozerBold!!
    }

@Suppress("ObjectPropertyName")
private var _BulldozerBold: ImageVector? = null
