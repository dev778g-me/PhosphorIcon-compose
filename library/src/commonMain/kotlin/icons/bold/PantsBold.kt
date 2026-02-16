package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.PantsBold: ImageVector
    get() {
        if (_PantsBold != null) {
            return _PantsBold!!
        }
        _PantsBold = ImageVector.Builder(
            name = "Bold.PantsBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(92f, 68f)
                horizontalLineTo(57.94f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 3.5f)
                lineToRelative(-6f, 48f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4.5f)
                arcTo(44.05f, 44.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 80f)
                verticalLineTo(72f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 92f, 68f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 119.5f)
                lineToRelative(-6f, -48f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -3.5f)
                horizontalLineTo(164f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 4f)
                verticalLineToRelative(8f)
                arcToRelative(44.06f, 44.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 44.06f, 44f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4.5f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(186f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.94f, 7f)
                lineToRelative(22f, 176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.94f, 9f)
                horizontalLineTo(167.31f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.76f, -6.06f)
                lineTo(128f, 96f)
                lineTo(96.45f, 217.94f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88.69f, 224f)
                horizontalLineTo(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.94f, -9f)
                lineToRelative(22f, -176f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 70f, 32f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 96f)
                lineTo(128f, 72f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(57.94f, 72f)
                lineTo(198.06f, 72f)
            }
        }.build()

        return _PantsBold!!
    }

@Suppress("ObjectPropertyName")
private var _PantsBold: ImageVector? = null
