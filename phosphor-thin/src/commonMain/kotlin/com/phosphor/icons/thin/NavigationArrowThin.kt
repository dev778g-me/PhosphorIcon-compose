package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.NavigationArrowThin: ImageVector
    get() {
        if (_NavigationArrowThin != null) {
            return _NavigationArrowThin!!
        }
        _NavigationArrowThin = ImageVector.Builder(
            name = "Thin.NavigationArrowThin",
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
                moveTo(152f, 152f)
                lineTo(234.35f, 129f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.27f, -15.21f)
                lineToRelative(-176f, -65.28f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48.46f, 58.63f)
                lineToRelative(65.28f, 176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.21f, -0.27f)
                close()
            }
        }.build()

        return _NavigationArrowThin!!
    }

@Suppress("ObjectPropertyName")
private var _NavigationArrowThin: ImageVector? = null
