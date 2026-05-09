package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ArrowsOutSimpleFill: ImageVector
    get() {
        if (_ArrowsOutSimpleFill != null) {
            return _ArrowsOutSimpleFill!!
        }
        _ArrowsOutSimpleFill = ImageVector.Builder(
            name = "Filled.ArrowsOutSimpleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 48f)
                verticalLineTo(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.66f, 5.66f)
                lineTo(184f, 83.31f)
                lineToRelative(-34.34f, 34.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, -11.32f)
                lineTo(172.69f, 72f)
                lineTo(154.34f, 53.66f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 40f)
                horizontalLineToRelative(48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 48f)
                close()
                moveTo(106.34f, 138.34f)
                lineTo(72f, 172.69f)
                lineTo(53.66f, 154.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 160f)
                verticalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineTo(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.66f, -13.66f)
                lineTo(83.31f, 184f)
                lineToRelative(34.35f, -34.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, -11.32f)
                close()
            }
        }.build()

        return _ArrowsOutSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowsOutSimpleFill: ImageVector? = null
