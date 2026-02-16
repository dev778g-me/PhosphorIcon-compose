package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.PrinterThin: ImageVector
    get() {
        if (_PrinterThin != null) {
            return _PrinterThin!!
        }
        _PrinterThin = ImageVector.Builder(
            name = "Thin.PrinterThin",
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
                moveTo(64f, 80f)
                lineToRelative(0f, -40f)
                lineToRelative(128f, 0f)
                lineToRelative(0f, 40f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(64f, 152f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(64f)
                horizontalLineToRelative(-128f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(64f, 176f)
                horizontalLineTo(24f)
                verticalLineTo(96f)
                curveToRelative(0f, -8.84f, 7.76f, -16f, 17.33f, -16f)
                horizontalLineTo(214.67f)
                curveTo(224.24f, 80f, 232f, 87.16f, 232f, 96f)
                verticalLineToRelative(80f)
                horizontalLineTo(192f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(188f, 116f)
                moveToRelative(-8f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
            }
        }.build()

        return _PrinterThin!!
    }

@Suppress("ObjectPropertyName")
private var _PrinterThin: ImageVector? = null
