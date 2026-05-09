package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ArrowElbowRightFill: ImageVector
    get() {
        if (_ArrowElbowRightFill != null) {
            return _ArrowElbowRightFill!!
        }
        _ArrowElbowRightFill = ImageVector.Builder(
            name = "Filled.ArrowElbowRightFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(240f, 80f)
                verticalLineToRelative(72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.66f, 5.66f)
                lineTo(196f, 127.31f)
                lineToRelative(-70.34f, 70.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                lineToRelative(-96f, -96f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 29.66f, 90.34f)
                lineTo(120f, 180.69f)
                lineTo(184.69f, 116f)
                lineTo(154.34f, 85.66f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 72f)
                horizontalLineToRelative(72f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 80f)
                close()
            }
        }.build()

        return _ArrowElbowRightFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowElbowRightFill: ImageVector? = null
