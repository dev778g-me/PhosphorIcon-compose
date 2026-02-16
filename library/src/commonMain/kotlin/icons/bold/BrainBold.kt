package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.BrainBold: ImageVector
    get() {
        if (_BrainBold != null) {
            return _BrainBold!!
        }
        _BrainBold = ImageVector.Builder(
            name = "Bold.BrainBold",
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
                moveTo(72f, 172f)
                horizontalLineTo(64f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 78.73f)
                verticalLineTo(72f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 0f)
                verticalLineTo(176f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184f, 172f)
                horizontalLineToRelative(8f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -93.27f)
                verticalLineTo(72f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, -80f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(196f, 116f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, -28f, -28f)
                verticalLineTo(84f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(60f, 116f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 88f)
                verticalLineTo(84f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 139.33f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, 208f, 176f)
                verticalLineToRelative(-6.73f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 139.33f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, 176f)
                verticalLineToRelative(-6.73f)
            }
        }.build()

        return _BrainBold!!
    }

@Suppress("ObjectPropertyName")
private var _BrainBold: ImageVector? = null
