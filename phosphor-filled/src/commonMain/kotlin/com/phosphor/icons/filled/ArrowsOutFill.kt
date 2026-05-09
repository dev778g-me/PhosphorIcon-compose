package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ArrowsOutFill: ImageVector
    get() {
        if (_ArrowsOutFill != null) {
            return _ArrowsOutFill!!
        }
        _ArrowsOutFill = ImageVector.Builder(
            name = "Filled.ArrowsOutFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 48f)
                lineTo(216f, 96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.66f, 5.66f)
                lineTo(184f, 83.31f)
                lineToRelative(-26.34f, 26.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, -11.32f)
                lineTo(172.69f, 72f)
                lineTo(154.34f, 53.66f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 40f)
                horizontalLineToRelative(48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 48f)
                close()
                moveTo(98.34f, 146.34f)
                lineTo(72f, 172.69f)
                lineTo(53.66f, 154.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 160f)
                verticalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                lineTo(96f, 216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.66f, -13.66f)
                lineTo(83.31f, 184f)
                lineToRelative(26.35f, -26.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, -11.32f)
                close()
                moveTo(211.06f, 152.61f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.72f, 1.73f)
                lineTo(184f, 172.69f)
                lineToRelative(-26.34f, -26.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, 11.32f)
                lineTo(172.69f, 184f)
                lineToRelative(-18.35f, 18.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 216f)
                horizontalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                lineTo(216f, 160f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 211.06f, 152.61f)
                close()
                moveTo(83.31f, 72f)
                lineToRelative(18.35f, -18.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 40f)
                lineTo(48f, 40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                lineTo(40f, 96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.66f, 5.66f)
                lineTo(72f, 83.31f)
                lineToRelative(26.34f, 26.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, -11.32f)
                close()
            }
        }.build()

        return _ArrowsOutFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowsOutFill: ImageVector? = null
