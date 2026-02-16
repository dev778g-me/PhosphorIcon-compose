package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.OctagonThin: ImageVector
    get() {
        if (_OctagonThin != null) {
            return _OctagonThin!!
        }
        _OctagonThin = ImageVector.Builder(
            name = "Thin.OctagonThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(164.45f, 32f)
                horizontalLineTo(91.55f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.66f, 2.34f)
                lineTo(34.34f, 85.89f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 91.55f)
                verticalLineToRelative(72.9f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.34f, 5.66f)
                lineToRelative(51.55f, 51.55f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 91.55f, 224f)
                horizontalLineToRelative(72.9f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.66f, -2.34f)
                lineToRelative(51.55f, -51.55f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.34f, -5.66f)
                verticalLineTo(91.55f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.34f, -5.66f)
                lineTo(170.11f, 34.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 164.45f, 32f)
                close()
            }
        }.build()

        return _OctagonThin!!
    }

@Suppress("ObjectPropertyName")
private var _OctagonThin: ImageVector? = null
